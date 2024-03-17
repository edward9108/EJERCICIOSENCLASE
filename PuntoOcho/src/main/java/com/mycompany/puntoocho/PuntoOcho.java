
package com.mycompany.puntoocho;

import java.util.Scanner;

public class PuntoOcho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char caracter;
        do {
            System.out.print("Ingrese un caracter (o presione espacio para terminar): ");
            caracter = scanner.next().charAt(0);

            if (caracter == ' ') {
                System.out.println("¡Espacio ingresado! Saliendo del programa.");
                    break;
            }

                if (esVocal(caracter)) {
                    
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            
        } while (caracter != ' ');

        scanner.close();
    }
    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter); 
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
        
    }
}
    

