/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diadasemana;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 para escolher um dia: ");
        int dia = inUser.nextInt();
        
        switch(dia){
        case 1 -> System.out.println("Domingo");
            
            
        case 2 -> System.out.println("Segunda-feira");
            
            
        case 3 -> System.out.println("Terça-feira");
            
          
        case 4 -> System.out.println("Quarta-feira");
            
            
            
        case 5 -> System.out.println("Quinta-feira");
            
            
        case 6 -> System.out.println("Sexta-feira");
            
        
        case 7 -> System.out.println("Sábado");

        default -> System.out.println("Dia inválido");
        }  
    }
}
