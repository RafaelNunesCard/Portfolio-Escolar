/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pulandonumeros;
import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class PulandoNumeros {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int pulando = 0;
        
        System.out.print("Digite um numero: ");
        pulando = user.nextInt();
        
        for(int i = 1;i <= 100; i += pulando) {
            System.out.println( i );
        }
    }
}
