/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogos;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Jogos {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);{
        System.out.println("Digite de 1 a 6 para escolher um jogo: ");
        int jogo = inUser.nextInt();
        
        switch(jogo){
        case 1 -> System.out.println("Minecraft");
            
            
        case 2 -> System.out.println("FIFA");
            
            
        case 3 -> System.out.println("Stardew valley");
            
          
        case 4 -> System.out.println("Free Fire");
            
            
            
        case 5 -> System.out.println("God of War");
            
            
        case 6 -> System.out.println("Peak Melhor jogo de hoje");
            
            
        case 7 -> System.out.println("Hollow Knight");
            
            
        default ->System.out.println("Não conheço seu jogo");
        }  
    }
    }
}
