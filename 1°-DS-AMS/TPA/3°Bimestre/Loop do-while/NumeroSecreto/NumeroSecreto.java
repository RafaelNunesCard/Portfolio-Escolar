/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosecreto;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class NumeroSecreto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(1, 20);
        int tentativas = 0;
        int numeroDigitado = 0;
        
        do{
            System.out.println("Digite um numero: ");
            numeroDigitado = scanner.nextInt();
            
           if(numeroSecreto < numeroDigitado){
               
               System.out.println("Quase mais para abaixo");
               
           }else{
               
               System.out.println("Quase mais para cima");
               
           }
           
            tentativas += 1;
        }while(numeroSecreto != numeroDigitado);
            System.out.println("Parabens voce acertou ^-^");
            if(tentativas !=1){
            System.out.println("Voce tentou " + tentativas + " vezes");
            }
            else{
                System.out.println("Voce tentou " + tentativas + " vez");
            }
    }
}
