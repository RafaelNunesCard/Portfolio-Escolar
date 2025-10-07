/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.switchcase;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner; 
public class NewMain {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.println("Quantas questoes vc Acertou? ");
        int resposta = inUser.nextInt();
        
        switch(resposta){
            case 1: 
            case 2:
            case 3:
            case 4:
                System.out.print("Voce tirou I"); break;
            case 5:
            case 6:
                System.out.print("Voce tirou R");break;
            case 7:
            case 8:
                System.out.print("voce tirou B");break;
            case 9:
            case 10:
                System.out.print("Voce tirou MB");break;
            default:
                System.out.print("Valor de entrada incorreto");
            }      
        }
    }
