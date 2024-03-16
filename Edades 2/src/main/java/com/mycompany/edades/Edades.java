/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Edades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Ingrese la primera edad: ");
        int edad1 = scanner.nextInt();
        
    
        System.out.print("Ingrese la segunda edad: ");
        int edad2 = scanner.nextInt();
        
     
        if (edad1 > edad2) {
            System.out.println("La primera edad (" + edad1 + ") es mayor que la segunda edad (" + edad2 + ").");
        } else if (edad1 < edad2) {
            System.out.println("La segunda edad (" + edad2 + ") es mayor que la primera edad (" + edad1 + ").");
        } else {
            System.out.println("Ambas edades son iguales (" + edad1 + " y " + edad2 + ").");
        }
       
    }
}
