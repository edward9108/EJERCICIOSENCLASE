
package com.mycompany.puntodiez;

import java.util.Scanner;


public class PuntoDiez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaTotal = 0;
        System.out.println("Ingrese 15 números:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            sumaTotal += numero;
        }

        System.out.println("La suma total de los 15 números es: " + sumaTotal);

        scanner.close();
    }
}  