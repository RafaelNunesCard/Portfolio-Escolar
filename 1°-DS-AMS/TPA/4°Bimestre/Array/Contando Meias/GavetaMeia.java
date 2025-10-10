/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gavetameia;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class GavetaMeia {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        int valor = 0;
        
        int[] meias = new int[5];
        for (int i = 0; i < meias.length; i++) {
            System.out.printf("Armario %d. quantas meias deseja guardar:\n ", (i+1));
            meias[i] = user.nextInt();
            
            valor += meias[i];
        }
        
        System.out.printf("Voce tem no total %d meias em suas gavetas\n", valor);
        user.close();
    }
}
