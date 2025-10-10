/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saboresdesuco;
import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class SaboresDeSuco {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        String[] sabores = new String[3];
        for (int i = 0; i < sabores.length; i++) {
            System.out.printf("Digite o seu %d. sabor de suco favorito:\n ", (i+1));
            sabores[i] = user.next();
        }
        System.out.println("Seus sucos favoritos:");
        for (int cont = 0; cont < sabores.length; cont++) {
            System.out.printf("%d. %s\n", cont+1, sabores[cont]);
        }
        user.close();
    }
}
