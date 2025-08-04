/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse;

/**
 *
 * @author Pichau
 */
import javax.swing.JOptionPane;
public class IfElse {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int Idade= 0; double Salario = 0; int r = 0; int Filhos = 0; /*Declarei as variáveis usando int para numeros interiros e double para numeros quebrados*/
        
        Idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));                                    /*O usuario insira sua idade*/
        
        if(Idade > 18){
            JOptionPane.showMessageDialog(null,"Parabens você está envelhecendo!");                                     /*Se a idade do usuario for maior que 18*/
        }
        else{
            JOptionPane.showMessageDialog(null,"Você ainda é feliz aproveite!");                                        /*Se a idade do usuario for menor que 18*/
        }
       
        if(Idade != 1){
            JOptionPane.showMessageDialog(null,"Vamos para o Próximo");                                                 /*Se a idade do usuario for difernte de 1*/
        }
        else{
            JOptionPane.showMessageDialog(null,"Ué você não sabe ler como chegou aqui?");                               /*Se a idade do usuario for igual a 1*/
            JOptionPane.showMessageDialog(null,"Vamos proceguir deve ser um cara se passando por criança");
        }
        
        Salario = Integer.parseInt(JOptionPane.showInputDialog("Insira seu salario: "));                                /*O usuario insira seu larario*/
        
        if(Salario < 1804){
            JOptionPane.showMessageDialog(null,"Que triste ;-;");                                                       /*Se o salario do usuario for menor que 1804*/
        }
        else{
            JOptionPane.showMessageDialog(null,"Intessante essa informação");                                           /*Se o salario do usuario for maior que 1804*/
        }
        
        r = Integer.parseInt(JOptionPane.showInputDialog("Insira o resultado de 2^3: "));                               /*A pessoa digita o resultado de 2^3*/
        
        if(r == 8){
            JOptionPane.showMessageDialog(null,"Parabens sabe 2^3!");                                                   /*Se o usuario digitar 8*/
        }
        else{
            JOptionPane.showMessageDialog(null,"Estude mais! ;-;");                                                     /*Se o usuario digitar um numero diferente de 8*/
        }
        
        Filhos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de filhos que vc tem: "));           /*O usuario inseri a quantidade de filhos*/
        
        if( Filhos <= 4){
            JOptionPane.showMessageDialog(null,"Somente o necessario");                                                 /*Se a quantidade de filhos do usuario for menor ou igual que 4*/
        }
        else{
            JOptionPane.showMessageDialog(null,"Você é o MR.Catra ou é tudo pelo bolsa familia?");                      /*Se a quantidade de filhos do usuario for maior que 4*/
        }
        
        if(Filhos >= 1){
            JOptionPane.showMessageDialog(null,"Espero que seus filhos estejam bem");                                   /*Se a quantidade de filhor for maior ou igual a 1*/
        }
        else{
            
            JOptionPane.showMessageDialog(null,"Você não tem filhos");                                                  /*Se a quantidade de filhor for menor a 1*/
        }
         JOptionPane.showMessageDialog(null,"Obrigado pela paciencia ^-^");                                             /*No final aparecera a janela de obrigado*/
    }
}
