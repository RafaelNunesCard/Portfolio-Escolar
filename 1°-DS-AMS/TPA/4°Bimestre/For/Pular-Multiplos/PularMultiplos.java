/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pularmultiplos;
/**
 *
 * @author Pichau
 */
public class PularMultiplos {

    public static void main(String[] args) {
        int pular = 4;
        
        for(int i = 1;i <= 30; i ++){
            if(i == pular){
                i++;
                pular +=4;
            }
            System.out.println( i );
        }
    }
}
