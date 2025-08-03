/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculandoareas;

/**
 *
 * @author Rafael Nunes Cardoso
 */
public class CalculandoAreas {

    public static void main(String[] args) {
        
         //Definição das variáveis
         
         int lado = 5;                   //Int: Nuúmero inteiro. Define o lado de um quadrado.
         
         double altura = 3.4;            //Double: Número é decimal. Define a base de um triângulo ou losango.
         
         double comprimento = 4.6;       //Define a base de um triângulo ou losango.
         
         int base = 3;                   //Define a base de um triângulo ou losango.
         
         double pi=3.14;                 //Aproximação do número π (pi)
         
         double raio=comprimento/2;      //Define a base de um triângulo ou losango.

        //Contas
               
         double Soma= altura + comprimento;                              // Soma +
         
         double Subtracao= altura - comprimento;                         // Subtração= - 
         
         double Multiplicacao= altura * comprimento;                     // Multiplicação= * 
         
         double Divisao= altura/comprimento;                             // Divisão= /
         
         double Media=(altura + comprimento)/2;                          // Média= 1°Parenteses e 2°Divisão 
         
         double Quadrado= lado*lado;                                     // Calculando o quadrado
         
         double Retangulo= altura*base;                                  // Calculando o retângulo
         
         double Losango= (altura*base)/2;                                // Base seria a metade
         
         double Triangulo= (altura*base)/2;                              // Calculando o triângulo
         
         double circunferencia= (raio*raio)*pi;                          // Calculando a circunferência
         
        //Vai exibir o resultado
        
         System.out.println("Calculos:");
         
         System.out.println("Soma:" + Soma);
         
         System.out.println("Subtracao:"+ Subtracao);
         
         System.out.println("Multiplicacao:" + Multiplicacao);
         
         System.out.println("Divisao:" + Divisao);           
         
         System.out.println("Media" + Media);
         
         System.out.println("Quadrado" + Quadrado);
         
         System.out.println("Retangulo" + Retangulo);
         
         System.out.println("Losango" + Losango);
         
         System.out.println("Triangulo" + Triangulo);
         
         System.out.println("Circunferencia aproximada" + circunferencia);
  
    }
    
}