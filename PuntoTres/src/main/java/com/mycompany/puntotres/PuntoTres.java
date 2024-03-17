

package com.mycompany.puntotres;

import java.util.Scanner;

public class PuntoTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 0 y 9999: ");
        int numero = scanner.nextInt();
        
        if (numero >= 0 && numero <= 9999) {
            int cifras = String.valueOf(numero).length();
            System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
        } else {
            System.out.println("El número ingresado está fuera del rango permitido.");
        }

        scanner.close();
    }
}
