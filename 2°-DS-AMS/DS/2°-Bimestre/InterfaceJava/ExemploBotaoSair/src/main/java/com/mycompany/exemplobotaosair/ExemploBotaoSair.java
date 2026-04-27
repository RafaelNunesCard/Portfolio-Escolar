/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplobotaosair;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploBotaoSair extends JFrame {
    JButton botaoSair;
    
    public ExemploBotaoSair(){
        super("Botão Sair");
        Container tela = getContentPane();
        
        setSize(400,200);
        setVisible(true);
        setLayout(null);
        
        
        // Conponente botaoSair:
        botaoSair = new JButton("Sair");
        botaoSair.setBounds(100,50,100,20);
        
        //Adicionando um evento para o botão:
        botaoSair.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );
        
        // Adicionando Componentes na tela:
        tela.add(botaoSair);
        
    }
    
    public static void main(String[] args) {
        ExemploBotaoSair app = new ExemploBotaoSair();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
