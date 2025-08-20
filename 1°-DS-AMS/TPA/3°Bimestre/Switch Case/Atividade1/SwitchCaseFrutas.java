/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.swichcasefrutas;

/**
 *
 * @author FATEC ZONA LESTE
 */

import java.util.Scanner;
public class SwitchCaseFrutas {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 3: ");
        int num = inUser.nextInt();
        
        switch(num){
            case 1: System.out.print("Maça");
            case 2: System.out.print("Banana");
            case 3: System.out.print("Laranja");
            default: System.out.print("Fruta invalida");
        }
    }
    
}
