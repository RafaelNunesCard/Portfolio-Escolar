/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculandonotas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class CalculandoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota de Matematica do Aluno: ");
        int math = scanner.nextInt();
        
        System.out.print("Digite a nota de Portugues do Aluno: ");
        int pt = scanner.nextInt();
        
        System.out.print("Digite a nota de Ciencias do Aluno: ");
        int cienc = scanner.nextInt();
        
        System.out.print("Digite a nota de Historia do Aluno: ");
        int histo = scanner.nextInt();
        
        double Media = (math + pt + cienc + histo)/4;
        
        System.out.println("Media do Aluno: " +Media);

        scanner.close();
    }
}
