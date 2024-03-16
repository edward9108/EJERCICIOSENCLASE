/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedionumerosnaturales;

import java.util.Scanner;


/**
 *
 * @author usuario
 */
public class PromedioNumerosNaturales {

    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números naturales: ");
        int cantidadNumeros = scanner.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero; // Agregar cada número a la suma
        }
        
        double promedio = (double) suma / cantidadNumeros;
        
        System.out.println("El promedio de los números naturales ingresados es: " + promedio);
        
        scanner.close();
    }
      
      
    }

