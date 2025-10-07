/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogo.favorito;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class JogoFavorito {
    Scanner inUser = new Scanner(System.in);{
        System.out.println("Digite de 1 a 6 para escolher um jogo: ");
        int jogo = inUser.nextInt();
        
        switch(jogo){
        case 1:
            System.out.println("Minecraft");
            break;
            
        case 2:
            System.out.println("FIFA");
            break;
            
        case 3:
            System.out.println("Stardew valley");
            break;
          
        case 4:
            System.out.println("Free Fire");
            break;
            
            
        case 5:
            System.out.println("God of War");
            break;
            
        case 6:
            System.out.println("Peak Melhor jogo de hoje");
            break;
            
        case 7:
            System.out.println("Hollow Knight");
            break;
            
        default:
            System.out.println("Não conheço seu jogo");
        }  
    }
}