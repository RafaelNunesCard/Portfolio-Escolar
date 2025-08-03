/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Pichau
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Digite o primeiro numero: ");
       double numero1 = scanner.nextDouble();
       
        System.out.print("Digite o segundo numero: ");
       double numero2 = scanner.nextDouble();
       
       double Multiplicacao = numero1 * numero2;
       
       double Divisao = numero1/numero2;
       
       double Soma = numero1 + numero2;
       
       double Subtracao = numero1 - numero2;
       
       System.out.println("Soma: " + Soma);
       
       System.out.println("Subtracao: " + Subtracao);
       
       System.out.println("Divisao: " + Divisao);
       
       System.out.println("Multiplicacao: " + Multiplicacao);
       
    }
}
