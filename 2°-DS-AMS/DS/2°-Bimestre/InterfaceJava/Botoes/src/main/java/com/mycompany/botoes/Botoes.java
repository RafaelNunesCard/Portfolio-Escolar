/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.botoes;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
public class Botoes extends JFrame {
    JButton botao1,botao2,botao3;
    ImageIcon icon,iconPng;
    
    public Botoes(){
        // Janela:
        super("Janela de RG");
        Container tela = getContentPane();
        tela.setBackground(Color.blue);
        
        setSize(800, 750);
        setVisible(true);
        setLayout(null);
        
        
        // Construindo o elemento de icon
        icon = new ImageIcon("Add.gif");
        
        iconPng = new ImageIcon("Enviar.png");
        
        // Construindo o componente botão1
        botao1 = new JButton("Adicionar",icon);
        botao1.setBounds(20,20,150,40);
        
        // Construindo o componente botão2
        botao2 = new JButton("Adicionar");
        botao2.setBounds(20,80,150,40);
        
        // Construindo o componente botão3
        botao3 = new JButton(iconPng);
        botao3.setBounds(20,140,150,40);
        
        //Adicionado a tela
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
    }
    
    public static void main(String[] args) {
        Botoes app = new Botoes();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
