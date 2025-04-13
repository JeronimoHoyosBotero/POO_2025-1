/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio_1_poo;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  Laboratorio 1 POO Java
 *  Por: Jerónimo Hoyos Botero
*/

public class Laboratorio_1_poo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamano = 0;

        while (true){

            System.out.println("Ingrese tamaño de lista menor o igual a 12: ");
            tamano = sc.nextInt();
            if (0 < tamano && tamano <= 12){break;}

        }
         
        int[] A = new int[tamano]; 
        int[] B = new int[tamano]; 

        for (int i = 0; i < tamano; i++){

            System.out.println("Ingrese valor entero para el indice " + i + " de A");
            int valor = sc.nextInt();
            A[i] = valor;

        }
          
        Random rand = new Random();

        for (int i = 0; i < tamano; i++) {
            B[i] = rand.nextInt(20) + 1; 
        }

        int[] sumaAyB = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            sumaAyB[i] = A[i] + B[i]; 
        }

        int[] productoAyB = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            productoAyB[i] = A[i] * B[i]; 
        }

        int pares_enterosA = 0;

        for (int i = 0; i < tamano; i++) {if(A[i]%2 == 0){pares_enterosA += A[i];}}

        int sumaB = 0;

        for (int i = 0; i < tamano; i++) {sumaB += B[i];}
        
        float promedioB = sumaB / tamano;

        int[] C = new int[tamano*2]; 

        for (int i = 0; i < tamano; i++) {
            C[i*2] = A[i];
            C[i*2+1] = B[i];
        }  

        int max = Arrays.stream(C).max().getAsInt();
        int indice_max = 0;

        for (int i = 0; i < tamano*2; i++) {
            if(max==C[i]){indice_max = i;}
        }  

        System.out.println("Resultados");
        System.out.println("Contenido del arreglo A: " + Arrays.toString(A));
        System.out.println("Contenido del arreglo B: " + Arrays.toString(B));
        System.out.println("Contenido del arreglo A + B: " + Arrays.toString(sumaAyB));
        System.out.println("Contenido del arreglo A * B: " + Arrays.toString(productoAyB));
        System.out.println("Suma enteros pares A: " + pares_enterosA);
        System.out.println("Promedio del arreglo B: " + promedioB);
        System.out.println("Contenido del arreglo C: " + Arrays.toString(C));
        System.out.println("El valor maximo del arreglo C es: " + max + " el cual esta en el indice " + indice_max);

    }
}