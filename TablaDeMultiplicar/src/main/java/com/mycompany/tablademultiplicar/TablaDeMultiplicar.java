/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablademultiplicar;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese un numero para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        
        System.out.println("tabla de multiplicar del "+ numero+ ":");
        for (int i =1; i <= 10; i++){
          int Resultado = numero * i;
          System.out.println(numero +"x"+ i + " = " + Resultado);
        }
    }
}
