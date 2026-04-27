/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacecombotao;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InterfaceComBotao extends JFrame{
    JButton botao1;
    public InterfaceComBotao(){
        
        //Janela configuração:
        super("Exemplo com JButton");
        Container tela = getContentPane();
        
        setSize(750, 500);
        setVisible(true);
        setLayout(null);
        
        
        // Componete Botão1:
        botao1 = new JButton ("Procurar");
        botao1.setBounds(50,20,100,20);
        botao1.setForeground(Color.blue); //alterar as cores do conteudo dentro do botão
        
        getRootPane().setDefaultButton(botao1); // Botão que recebera o foco
        
        botao1.setMnemonic(KeyEvent.VK_P); // Evento do botão
        
        
        // Adcionando Componetes na tela:
        tela.add(botao1);
        
    }

    public static void main(String[] args) {
        InterfaceComBotao app = new InterfaceComBotao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
