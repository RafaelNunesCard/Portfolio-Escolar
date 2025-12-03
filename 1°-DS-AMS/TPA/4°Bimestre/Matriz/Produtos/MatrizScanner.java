package com.mycompany.matriz.scanner;
import java.util.Scanner;

public class MatrizScanner {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos: ");
        int quant = leia.nextInt();
  
        String[][] Matriz = new String[quant + 1][4];
        
        Matriz [0][0] = "Nome";
        Matriz [0][1] = "Valor";
        Matriz [0][2] = "Desconto";
        Matriz [0][3] = "Total";
        
        for(int i = 1; i < Matriz.length; i++){
            System.out.printf("Digite o nome do produto %d: ",i);
            Matriz [i][0] = leia.next();
            
            System.out.printf("Digite o valor do produto %d: ",i);
            Matriz [i][1] = leia.next();
            
            System.out.printf("Digite o desconto do produto %d: ",i);
            Matriz [i][2] = leia.next();
            
            double valor = Double.valueOf(Matriz[i][1]);
            double desconto = Double.valueOf(Matriz[i][2]);
            
            if(desconto != 0){
                Matriz [i][3] =  String.valueOf(valor * ((100 - desconto) / 100));
            }else{
                Matriz [i][3] = "Não";
            } 
            System.out.println(" ");
        }
        
        for(int i = 0; i < Matriz.length; i++){
            for(int j = 0; j < Matriz[i].length; j++){
                System.out.printf("| %-8s", Matriz[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }
    }
}
