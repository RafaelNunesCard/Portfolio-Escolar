/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploarraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Pichau
 */
public class ExemploArrayList {

    public static void main(String[] args) {
         ArrayList<String> nomes = new ArrayList<>();
        
        // 1. Este método adiciona um novo item ao final da lista
        nomes.add("Marcos");
        nomes.add("Bueno");
        System.out.println(nomes);
        // 2. Retorna um item na posição indicada
        System.out.printf("O primeiro nome é %s\n", nomes.get(0));
        
        // 3. Este método substitui o valor da variável
        nomes.set(1, "Vinicius");
        System.out.printf("Meu nome na verdade é %s %s\n", nomes.get(0), nomes.get(1));
        
        // 4. Este método remove o item da lista
        nomes.remove(0);
        System.out.printf("Lista atualizada é %s\n", nomes);
        
        // 5. Retorna quantos elementos tem na lista
        System.out.printf("O tamanho da lista é %s\n", nomes.size());
        
        // 6. Este método limpa toda a lista
        nomes.clear();
        System.out.printf("Sua lista atualizada é \n %s\n", nomes);
        
        // 7. Verifica se contem o item na lista
        nomes.add("Bueno");
        System.out.printf("Existe na minha lista 'Marcos'? %s\n", nomes.contains("Bueno"));
        
        // 8. Este método verifica se a lista está vazia ou não
        System.out.printf("A lista esta vazia? \n %s\n", nomes.isEmpty());
        
        // 9. Organiza os elementos em ordem Crescente (Importe a classe)
        
        nomes.add("Carros");
        nomes.add("Jogos");
        Collections.sort(nomes);
        System.out.printf("Lista em ordem crescente %s\n", nomes);
        
        // 10. Usando forEach para mostrar a lista
        
        nomes.forEach(nome -> System.out.printf("Ola %s\n", nome));
        System.out.println("");
        // 11. Usando um for mais prático
     
        int contador =1;
        for(String item : nomes){
            System.out.printf("%s. %s\n",contador, item );
            contador++;
        }
    
    }
}
