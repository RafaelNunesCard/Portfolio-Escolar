/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frutas;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Frutas {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 6 para escolher uma Fruta: ");
        int fruta = inUser.nextInt();
        
        switch(fruta){
        case 1 -> System.out.println("Banana");
            
            
        case 2 -> System.out.println("Maça");
            
            
        case 3 -> System.out.println("Uva");
            
          
        case 4 -> System.out.println("Morango");

                
        case 5 -> System.out.println("Abacaxi");  

            
        case 6 -> System.out.println("Melancia");


        default -> System.out.println("Dia inválido");
        }  
    }
}
