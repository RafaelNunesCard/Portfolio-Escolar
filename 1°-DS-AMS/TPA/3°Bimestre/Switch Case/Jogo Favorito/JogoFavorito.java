/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogofavorito;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class JogoFavorito {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 para escolher um dia: ");
        int jogo = inUser.nextInt();
        
        switch(jogo){
        case 1:
            System.out.println("Domingo");
            break;
            
        case 2:
            System.out.println("Segunda-feira");
            break;
            
        case 3:
            System.out.println("Terça-feira");
            break;
          
        case 4:
            System.out.println("Quarta-feira");
            break;
            
            
        case 5:
            System.out.println("Quinta-feira");
            break;
            
        case 6:
            System.out.println("Sexta-feira");
            break;
        
        case 7:
            System.out.println("Sábado");

        default:
            System.out.println("Dia inválido");
        }  
    }
}
    
