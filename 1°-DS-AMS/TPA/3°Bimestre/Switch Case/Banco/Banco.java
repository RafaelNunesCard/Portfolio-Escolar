/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author FATEC ZONA LESTE
 */

import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            double saldo = 1800;
            double total = 0;
            System.out.println("""
                     Serviço disponiveis:
                     1-Consultar Saldo
                     2-Sacar Dinheiro
                     3-Depositar Dinheiro
                     4-Encerrar atendimento
                     Por favor insira o numero do serviço desejado.
                      """);
            
            System.out.println("Por favor, insira o numero do servico desejado: ");
            int servico = scanner.nextInt();
            switch(servico){
                case 1: 
                    System.out.println(" Voce escolheu o serviço de Consultar Saldo");
                    System.out.println(" Voce tem no banco:" + "RS" + saldo);
                    break;
                    
                case 2:
                    System.out.println("Voce escolheu o serviço de Sacar Dinheiro");
                    System.out.println("Quanto voce quer sacar: ");
                    double saque = scanner.nextDouble();
                    if(saldo>= saque){
                        total = saldo - saque;
                    System.out.println("Agora voce tem de saldo: " + "RS" + total);
                    }else{
                        System.out.println("Voce nao tem essa quantidade de saldo");
                    }
                    break;
             
                case 3: System.out.println("Voce escolheu o serviço de Depositar Dinheiro");
                        System.out.println("Digite a quantidade que deseja depositar: ");
                        double deposito = scanner.nextDouble();
                        total = saldo + deposito;
                        System.out.println("Agora voce tem de saldo: " + "RS" + total);
                    break;
                    
               case 4: System.out.println("Encerrando Atendimento");
                    break;
                    
               default: System.out.println("Opcao Invalida");
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro");
        } 
        finally{
            System.out.println("Obrigado pela Preferencia");
        }
    }
}
