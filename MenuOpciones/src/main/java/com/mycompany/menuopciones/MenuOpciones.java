/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menuopciones;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MenuOpciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Menu de opciones");
        
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4.DIVISION");
        System.out.println("5. SALIR");
        System.out.println("Ingrese su Opcion");
        
        while(true){
        int opcion = scanner .nextInt();
        if (opcion ==5){
        System.out.println(" ¡HASTA LUEGO! ");
        break;
        }
        if (opcion == 1){
            System.out.println("ingrese dos numeros a sumar");
            double numero1 =scanner.nextDouble();
            double numero2 = scanner.nextDouble();
            double Resultado = numero1 + numero2;
            
        System.out.println("el resultado de  La suma es: " +Resultado);      
        }
        if (opcion ==2){
            System.out.println("ingrese dos numeros a restar");
            double numero1 =scanner.nextDouble();
            double numero2 = scanner.nextDouble();
            double Resultado = numero1 - numero2;
            
             System.out.println("el resultado de la resta es: " +Resultado);
              }
        if (opcion ==3){
         System.out.println("ingrese dos numeros a multiplicar");
            double numero1 =scanner.nextDouble();
            double numero2 = scanner.nextDouble();
            double Resultado = numero1 * numero2;
             System.out.println("el resultado de la multiplicacion es: " +Resultado);      
        }
        
         if (opcion ==4){
         System.out.println("ingrese dos numeros diferentes de cero a dividir");
            double numero1 =scanner.nextDouble();
            double numero2 = scanner.nextDouble();
            double Resultado = numero1 / numero2;
             System.out.println("el resultado de la division es: " +Resultado);  
        }
        }   
    }
}
