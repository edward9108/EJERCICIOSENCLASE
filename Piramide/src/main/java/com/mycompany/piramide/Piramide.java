/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.piramide;

/**
 *
 * @author usuario
 */
public class Piramide {

    public static void main(String[] args) {
        
                int altura = 5; 

        for (int i = 1; i <= altura; i++) {
       
            for (int j =1; j <= altura-i; j++){
                System.out.print(" ");
            }
            
            for (int k=1;  k <= 2*i-1; k++ ){
                System.out.print("*");
            }
            
            System.out.println();
             
        }
    }
}

    
        
                
        
       
    

