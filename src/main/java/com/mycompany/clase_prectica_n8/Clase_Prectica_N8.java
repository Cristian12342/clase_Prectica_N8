/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase_prectica_n8;
import java.util.Scanner;
/**
 *
 * @author Calavera
 */
public class Clase_Prectica_N8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float [ ] puntucaion = new float[7];
        float totalPuntos = 0;
        float promedio = 0;
        float diaMayorPuntaje = 0;
        float diaMenorPuntaje = 0;   


        System.out.println("------------------------------------------------");
        System.out.println("Bienvenido al programa de puntuacion semanal");
        System.out.println("--------------------------------------------");
        System.out.println("Este programa le ayudara a calcular el promedio de sus puntuaciones semanales");
        System.out.println("Recuerde que la puntuacion es de 1 a 10"); 
        System.out.println("Si ingresa un valor fuera del rango, se tomara como 0"); 
       
do {
    
} while ();
        for(int i = 0; i < puntucaion.length; i++){
            System.out.println("Ingrese la puntuacion del dia " + (i+1) + ": ");
            String entrada=teclado.nextLine();
            
            puntucaion [i]= Float.parseFloat(entrada.replace(",","."));
           
            
            totalPuntos =totalPuntos+ puntucaion[i];
        }
        System.out.println("------------------------------------------------");
        System.out.println("Estas son tus notas ingresadas:");
        for(int i=0 ; i<7 ; i++){
        System.out.println("Nota N"+(i+1)+": "+puntucaion[i]+" ");
        }
        System.out.println("------------------------------------------------");
        System.out.println("---MENU PRINCIPAL---");

        System.out.println("1. Calcular el total de Puntuacion de la semana");
        System.out.println("2. Calcular el promedio de Puntuacion de la semana y mostrar los dias por encima y por debajo del promedio");
        System.out.println("3. Calcular el promedio de Puntuacion de la semana --Dias Mayor Puntaje y Dia Menor Puntaje");
        System.out.println("4. Calcular el total de Puntaciones acomuladas durante los primeros 4 dias y los ultimos 4 dias");
        System.out.println("5. Salir");
        switch (puntucaion.length) {
            case 1:
            for(int i = 0; i < puntucaion.length; i++){
                
                break;
        
            default:
                break;
        }
    }
}

    
        

        
    

