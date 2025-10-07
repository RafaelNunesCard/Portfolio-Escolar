/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cronometro;
import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class Cronometro {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int tempo = 0;
        int s = 0;
        int m = 0;
        
        System.out.print("Escolha o tempo do Cronometro: ");
        tempo = user.nextInt();
        
        for(int i = 1;i <= tempo; i++) {
            s += 1;
            if(s == 60){
                m++;
                s=0;
            }
            
            System.out.println(m +"min "+ s + "s");
        }
        
    }
}
