
package com.mycompany.puntodos;

import java.util.Scanner;


public class PuntoDos {

    public static void main(String[] args) {
        // Definir la contraseña
        
         String contrasena;
        contrasena = "1234";
     
        // Solicitar al usuario que ingrese la contraseña
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String contrasenaUsuario = scanner.nextLine();

        // Comparar la contraseña ingresada por el usuario con la contraseña guardada
        if (contrasena.equalsIgnoreCase(contrasenaUsuario)) {
            System.out.println("¡La contraseña es correcta!");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }

        scanner.close();
    }
}
  