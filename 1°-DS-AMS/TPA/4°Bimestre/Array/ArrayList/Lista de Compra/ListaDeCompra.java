/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listadecompra;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class ListaDeCompra {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> Lista = new ArrayList<>();

        boolean loop = true;

        System.out.println("""
                           Voce quer criar uma lista?
                           
                           1.Sim
                           2.Nao
                           """);
        int querer = leia.nextInt();

        switch (querer) {
            case 1:
                do {
                    int contador = 1;
                    System.out.println("""
                                   Escolha o servico 
                                   
                                   1.Adicionar um item na lista
                                   2.Trocar um item da lista
                                   3.Remover um item da lista
                                   4.Mostrar a sua lista
                                   5.Sair
                                   """);
                    int opcao = leia.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Sua lista esta: ");
                            for (String item : Lista) {
                                System.out.printf("\n%d. %s\n", contador, item);
                                contador++;
                            }
                            System.out.println("Digite o proximo item da lista:");
                            String item = leia.next();
                            Lista.add(item);
                            break;

                        case 2:
                            if (contador < Lista.size()) {
                                System.out.println("Sua lista esta: ");
                                for (String iitem : Lista) {
                                    System.out.printf("\n%d. %s\n", contador, iitem);
                                    contador++;
                                }
                                System.out.println("Digite o item da lista que deseja trocar:");
                                int troca = leia.nextInt();
                                troca--;

                                System.out.println("Digite agora o novo item: ");
                                String novo = leia.next();
                                Lista.set(troca, novo);
                            } else {
                                System.out.println("""
                                                    Voce nao tem nenhum item na lista para trocar!
                                                    Se quiser adicione um item na lista primeiro.
                                                    """);
                            }
                            break;

                        case 3:
                            if (contador < Lista.size()) {
                                System.out.println("Sua lista esta: ");
                                for (String iiitem : Lista) {
                                    System.out.printf("\n%d. %s\n", contador, iiitem);
                                    contador++;
                                }
                                System.out.println("Digite o item da lista que deseja remover:");
                                int remove = leia.nextInt();
                                remove--;
                                Lista.remove(remove);
                            } else {
                                System.out.println("""
                                                    Voce nao tem nenhum item na lista para remover!
                                                    Se quiser adicione um item na lista primeiro.
                                                    """);
                            }
                            break;
                            
                        case 4:
                            System.out.println("Sua lista esta assim: ");
                                for (String iiitem : Lista) {
                                    System.out.printf("\n%d. %s\n", contador, iiitem);
                                    contador++;
                                }
                            break;
                            
                        case 5:
                            System.out.println("Voce escolheu a opcao sair!");
                            loop = false;
                            break;
                    }
                } while (loop);
                System.out.println("""
                                   Obrido pela atençao!
                                   Volte sempre ^-^!
                                    """);
                break;

            case 2:
                System.out.println("""
                                   Obrido pela atençao!
                                   Quando precisar de uma lista eu estou aqui ^-^!
                                    """);
                break;
        }
    }
}
