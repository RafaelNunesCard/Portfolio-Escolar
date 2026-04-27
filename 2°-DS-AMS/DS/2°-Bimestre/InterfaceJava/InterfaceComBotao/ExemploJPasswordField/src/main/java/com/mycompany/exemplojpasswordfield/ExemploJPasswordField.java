/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojpasswordfield;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploJPasswordField extends JFrame {
    JPasswordField caixa;
    JLabel rotulo;
    
    public ExemploJPasswordField(){
        // Tela:
        super("Campo para Senha");
        Container tela = getContentPane();
        
        setSize(500,250);
        setVisible(true);
        setLayout(null);
        
        
        // Componente rotulo:
        rotulo = new JLabel("senha");
        rotulo.setBounds(50,20,100,20);
        
        //Componente caixa:
        caixa = new JPasswordField(10);
        caixa.setBounds(50, 40, 100, 20);
        caixa.setEchoChar('*');// Qual item vai aparecer no lugar da bolinha
        
        
        // Adicionando componentes na tela:
        tela.add(rotulo);
        
        tela.add(caixa);
        
    }

    public static void main(String[] args) {
        ExemploJPasswordField app = new ExemploJPasswordField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
