/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o Numero: ");
        double num = scanner.nextDouble();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(num +" x " + i + " = " + i * num);
        }
        
        scanner.close();
    }
}
