
package com.mycompany.puntocuatro;

import java.util.Scanner;


public class PuntoCuatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el día, mes y año de la fecha
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();
        boolean fechaValida = verificarFecha(dia, mes, año);
        if (fechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es válida.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " no es válida.");
        }

        scanner.close();
    }
    public static boolean verificarFecha(int dia, int mes, int año) {
        if (año < 0 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        if (mes == 2) { 
            if (dia > 28) {
                return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
            if (dia > 30) {
                return false;
            }
        } else { 
            if (dia > 31) {
                return false;
            }
        }
        return true;
    }
}