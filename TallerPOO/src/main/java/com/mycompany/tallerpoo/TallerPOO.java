
package com.mycompany.tallerpoo;

import java.util.Scanner;

public class TallerPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de índice de masa corporal (IMC)");
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();

        double imc = calcularIMC(peso, estatura);

        System.out.println("Su índice de masa corporal (IMC) es: " + imc);
        interpretarIMC(imc);

        scanner.close();
    }

    public static double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }

    public static void interpretarIMC(double imc) {
        if (imc < 16) {
            System.out.println("Tiene Delgadez Severa.");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Tiene Delgadez Moderada.");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Tiene Delgadez Leve.");
        } else if (imc >= 18.5 && imc < 25) { 
            System.out.println("Tienes Peso Normal.");
        }else if (imc >= 25 && imc < 30) {
            System.out.println("Tiene Sobre Peso");
        }else if (imc >= 30 && imc < 35) {
           System.out.println("Obesidad Leve"); 
        }else if (imc >= 35 && imc < 40) {
          System.out.println("Obesidad Moderada");   
        }else {
           System.out.println("Tiene Obesidad");   
        }
    }
}
