/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadosdousuario;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class DadosDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua data de nacimento: ");
        String nacimento = scanner.nextLine();
        
        System.out.print("Digite o seu curso: ");
        String curso = scanner.nextLine();
        
        System.out.print("Digite sua serie: ");
        int serie = scanner.nextInt();
        
        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Ola " + nome);
        
        System.out.println("! Voce naceu em " + nacimento);
        
        System.out.println("Seu curso: " + curso );
        
        System.out.println("Sua serie: " + serie + "do ensino medio");
        
        System.out.println("Sua altura: " + altura + "m");
        
        System.out.println("Seu peso: " + peso + "Kg");
        
        System.out.println("Foi um prazer te conhecer.");
        
    }
}
