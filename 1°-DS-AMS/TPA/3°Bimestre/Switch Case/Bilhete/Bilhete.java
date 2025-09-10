/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bilhete;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class Bilhete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double urbano= 4.40; 
        double metro= 5; 
        double trem= 6.50; 
        double rodovia= 12;
        double valor= 0;
        
        try{
            System.out.print("""
                    Passagens disponiveis: 
                    1-Onibus Urbano=RS4.40
                    2-Metro=RS5.00
                    3-Trem=RS6.50
                    4-Rodovia=RS12.00
                    Por favor insira o numero da passagem desejada.
                    """);
            System.out.print("Por favor, insira o numero da passagem desejada: ");
            int passagem = scanner.nextInt();
            System.out.print("Agora insira a quantidade: ");
            int quantidade = scanner.nextInt();
            switch (passagem){
                case 1 -> valor = quantidade * urbano;
                    
                case 2 -> valor= quantidade * metro;
                  
                case 3 -> valor= quantidade * trem;
                    
               case 4 -> valor= quantidade * rodovia;
                    
               default -> System.out.print("Opcao Invalida");
                   
            }
        }
        catch(Exception e){
            System.out.print("Ocorreu um erro");
        }
        finally{
            System.out.print("Voce tera que pagar:" + "RS" + valor);
        }
    }
}
