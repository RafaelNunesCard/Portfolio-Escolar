/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysmetodos;
import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class ArraysMetodos {

    public static void main(String[] args) {
        
        String [] musicas = {"Invisible", "Waiting For The End"}; 
       System.out.printf("Os dois valores sao %s, %s\n",musicas[0],musicas[1] );
       
       //Este método faz a contagem de caracteres
       System.out.printf("O nome %s tem %s letras",musicas[0],musicas[0].length() );
       
       //Este método transforma tudo em maiusculo
       System.out.printf("O nome %s em maiusculo é %s.\n",musicas[0],musicas[0].toUpperCase() );
       
       //Este método transforma em minusculas
       System.out.printf("O nome %s em minusculas é: %s.\n",musicas[0],musicas[0].toLowerCase() );
       
       //Este método traz a letra em uma posição especifíca
       System.out.printf("A primeira letra de %s é %s.\n",musicas[0],musicas[0].charAt(0) );
       
       //Este método traz uma parte da String
       System.out.printf("A 3 primeiras letras de %s é %s.\n",musicas[0],musicas[0].substring(0,3) );
       
       //Este método também traz a String a partir do indice selecionado
       System.out.printf("A ultimas letras de %s é %s.\n",musicas[0],musicas[0].substring(3) );
       
       //Este método faz comparações
       System.out.printf("O nome %s é igual a 'Invi'? %s.\n",musicas[0],musicas[0].equals("Invi") );
       
       //Este método faz comparações sem levar em conta Case
       System.out.printf("O nome %s é igual a 'Invi'? %s.\n",musicas[0],musicas[0].equalsIgnoreCase("invisible") );
       
       // 8. Este método verifica se contém alguma parte do texto
       System.out.printf("O nome %s contem a 'Inv'? %s.\n",musicas[0],musicas[0].contains("Inv") );
       
       // 9. Este método verifica se começa com determinada sílaba
       System.out.printf("O nome %s comeca com 'Invi'? %s.\n",musicas[0],musicas[0].startsWith("Invi") );
       
       // 10. Este método verifica se termina com determinada sílaba 
       System.out.printf("O nome %s termina com 'ible'? %s.\n",musicas[0],musicas[0].endsWith("ible") );
       
       // 11. Este método faz a substituição de uma parte ou toda da String
       System.out.printf("Troque %s por 'Iridescent'. Agora eu escuto %s.\n",musicas[0],musicas[0].replace("Invisible","Iridescent") );

    }
}
