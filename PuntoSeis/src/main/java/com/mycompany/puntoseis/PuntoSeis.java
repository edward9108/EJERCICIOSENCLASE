
package com.mycompany.puntoseis;

import java.util.Scanner;

public class PuntoSeis {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Pizzería Bella Napoli");
        System.out.println("¿Qué tipo de pizza desea?");
        System.out.println("1. Vegetariana");
        System.out.println("2. No vegetariana");
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcionPizza = scanner.nextInt();

        String[] ingredientesVegetarianos = {"Pimiento", "Tofu"};
        String[] ingredientesNoVegetarianos = {"Peperoni", "Jamón", "Salmón"};

        // Mostrar menú de ingredientes según la elección del usuario
        if (opcionPizza == 1) {
            System.out.println("\nIngredientes disponibles para pizzas vegetarianas:");
            for (int i = 0; i < ingredientesVegetarianos.length; i++) {
                System.out.println((i + 1) + ". " + ingredientesVegetarianos[i]);
            }
        } else if (opcionPizza == 2) {
            System.out.println("\nIngredientes disponibles para pizzas no vegetarianas:");
            for (int i = 0; i < ingredientesNoVegetarianos.length; i++) {
                System.out.println((i + 1) + ". " + ingredientesNoVegetarianos[i]);
            }
        } else {
            System.out.println("Opción no válida.");
            return; // Salir del programa si la opción no es válida
        }

        // Solicitar al usuario que elija un ingrediente
        System.out.print("Elija un ingrediente (número): ");
        int opcionIngrediente = scanner.nextInt();

        // Mostrar la pizza elegida y sus ingredientes
        System.out.println("\nSu pizza:");
        if (opcionPizza == 1) {
            System.out.println("Tipo: Vegetariana");
            System.out.println("Ingredientes: Mozzarella, Tomate, " + ingredientesVegetarianos[opcionIngrediente - 1]);
        } else if (opcionPizza == 2) {
            System.out.println("Tipo: No vegetariana");
            System.out.println("Ingredientes: Mozzarella, Tomate, " + ingredientesNoVegetarianos[opcionIngrediente - 1]);
        }

        scanner.close();
    }
}
  