
package com.mycompany.puntonueve;


public class PuntoNueve {

    public static void main(String[] args) {
         int lado = 8;

        // Dibujar el cuadrado
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                // Imprimir asterisco en las esquinas y en los bordes
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    // Imprimir espacio en blanco para el interior del cuadrado
                    System.out.print("  ");
                }
            }
            // Saltar a la siguiente línea después de imprimir una fila completa
            System.out.println();
        }
    }
}
    
