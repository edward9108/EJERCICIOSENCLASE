
package com.mycompany.puntocinco;

import java.util.Scanner;

public class PuntoCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese sus ingresos mensuales en euros: ");
        double ingresos = scanner.nextDouble();

        if (edad > 16 && ingresos >= 1000) {
            System.out.println("Usted debe tributar.");
        } else {
            System.out.println("Usted no debe tributar.");
        }

        scanner.close();
    }
}
    
 