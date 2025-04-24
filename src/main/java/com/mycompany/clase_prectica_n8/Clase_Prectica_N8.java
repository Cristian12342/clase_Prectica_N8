
package com.mycompany.clase_prectica_n8;

import java.util.Scanner;

/**
 *
 * @author Calavera
 */
public class Clase_Prectica_N8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float[] puntuacion = new float[7];
        float totalPuntos = 0;
        float promedio = 0;
        int diaMayorPuntaje = 0;
        int diaMenorPuntaje = 0;
        float totalPuntosPrimeros4Dias = 0;
        float totalPuntosUltimos4Dias = 0;
        int opcion = 0;

        System.out.println("------------------------------------------------");
        System.out.println("Bienvenido al programa de puntuacion semanal");
        System.out.println("--------------------------------------------");
        System.out.println("Este programa le ayudara a calcular el promedio de sus puntuaciones semanales");
        System.out.println("Recuerde que la puntuacion es de 1 a 10");
        System.out.println("Si ingresa un valor fuera del rango, se volvera a pedir el valor");

        for (int i = 0; i < 7; i++) {
            do {
                System.out.println("Ingrese la puntuación del día " + (i + 1) + ": ");
                String entrada = teclado.nextLine();
                puntuacion[i] = Float.parseFloat(entrada.replace(",", "."));

                if (puntuacion[i] < 1 || puntuacion[i] > 10) {
                    System.out.println("Valor inválido. Ingrese un número entre 1 y 10.");
                }

            } while (puntuacion[i] < 1 || puntuacion[i] > 10);

        }

        System.out.println("------------------------------------------------");
        System.out.println("Estas son tus notas ingresadas:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Nota N" + (i + 1) + ": " + puntuacion[i] + " ");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("---MENU PRINCIPAL---");
       
            System.out.println("1. Calcular el total de Puntuacion de la semana");
            System.out.println("2. Calcular el promedio de Puntuacion de la semana y mostrar los dias por encima y por debajo del promedio");
            System.out.println("3. Calcular el promedio de Puntuacion de la semana --Dias Mayor Puntaje y Dia Menor Puntaje");
            System.out.println("4. Calcular el total de Puntaciones acomuladas durante los primeros 4 dias y los ultimos 4 dias");
            System.out.println("5. Salir");

            System.out.println("-------------------------------------------------");
            System.out.println("Ingrese la opción deseada: ");
            opcion = teclado.nextInt();
        do{
            switch (opcion) {

                case 1:
                    for (int i = 0; i < 7; i++) {
                        totalPuntos = totalPuntos + puntuacion[i];
                    }
                    System.out.printf("El total de puntos es: " + totalPuntos);
                    break;

                case 2:
                    for (int i = 0; i < 7; i++) {
                        totalPuntos = totalPuntos + puntuacion[i];
                    }
                    promedio = totalPuntos / 7;
                    System.out.printf("El promedio de puntos es: " + "%.2f\n", promedio);

                    for (int i = 0; i < 7; i++) {
                        if (puntuacion[i] > 7) {
                            diaMayorPuntaje++;
                        } else if (puntuacion[i] < 6) {
                            diaMenorPuntaje++;
                        }
                    }
                    System.out.println("Hay " + diaMayorPuntaje + " dias por encima del promedio");
                    System.out.println("Hay " + diaMenorPuntaje + " dias por debajo del promedio");
                    break;

                case 3:
                    System.out.println("Los dias con mayor puntacion mas alta y el dia con menor puntacion son: ");
                    for (int i = 0; i < 7; i++) {
                        if (puntuacion[i] > puntuacion[diaMayorPuntaje]) {
                            diaMayorPuntaje = i;
                        }
                        if (puntuacion[i] < puntuacion[diaMenorPuntaje]) {
                            diaMenorPuntaje = i;
                        }
                    }
                    System.out.println("Dia con mayor puntaje: Dia " + (diaMayorPuntaje + 1) + " con puntuacion de: "
                            + puntuacion[diaMayorPuntaje]);
                    System.out.println("Dia con menor puntaje: Dia " + (diaMenorPuntaje + 1) + " con puntuacion de: "
                            + puntuacion[diaMenorPuntaje]);
                    break;

                case 4:
                    
                    for (int i = 0; i < 4; i++) {
                        totalPuntosPrimeros4Dias += puntuacion[i];
                    }
                    for (int i = 3; i < 7; i++) {
                        totalPuntosUltimos4Dias += puntuacion[i];
                    }
                    System.out.println("El total de puntos acumulados durante los primeros 4 días es: "
                            + totalPuntosPrimeros4Dias);
                    System.out.println(
                            "El total de puntos acumulados durante los últimos 4 días es: " + totalPuntosUltimos4Dias);
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    break;

            }
        
        }while (opcion!=5); 
    }
    
}

