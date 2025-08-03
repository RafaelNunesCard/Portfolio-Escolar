/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroprimo;

/**
 *
 * @author Pichau
 */
import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont=0;
        
        System.out.print("Digite um Numero: ");
        int Numero = scanner.nextInt();
        for (int i = 1; i <= Numero; i++) {
            if(Numero%i==0){
                cont++;
            }
        }
        if (cont==2){
            System.out.println("O " + Numero + " e primo" );
        }else{
            System.out.println("O " + Numero + "nao e primo" );
         }
    }
}

