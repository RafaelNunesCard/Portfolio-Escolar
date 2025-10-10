/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produtosdelimpeza;
import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class ProdutosDeLimpeza {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        double total = 0;
        
        double[] valores = new double[4];
        int[] quantidade = new int[4];
        String[] produtos = {"Sabao","Detergente","Amaciante","Bucha"};
        
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o valor do %s :\n", produtos[i]);
            valores[i] = user.nextDouble();
            
            System.out.printf("Digite a quantidade de %s :\n", produtos[i]);
            quantidade[i] = user.nextInt();
            
            total += valores[i]*quantidade[i];
        }
        
        System.out.printf("O valor total: %.2fR$\n", total);
    }
}
