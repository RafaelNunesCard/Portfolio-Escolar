/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;
import java.util.Scanner;
/**
 *
 * @author Pichau
 */

public class Tabuada {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int numeroDigitado = 0;
        
        System.out.print("Digite um numero: ");
        numeroDigitado = user.nextInt();
        
        System.out.println("Tabuada do " +  numeroDigitado + " :");
        for(int i = 1; i <= 10; i++) {
            System.out.println(numeroDigitado + " X " + i + " = " + numeroDigitado * i);
        }
    }
}
