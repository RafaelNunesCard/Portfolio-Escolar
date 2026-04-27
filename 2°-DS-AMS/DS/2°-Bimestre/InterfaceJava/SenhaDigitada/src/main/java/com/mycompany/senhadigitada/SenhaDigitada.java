/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senhadigitada;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class SenhaDigitada extends JFrame {
    JPasswordField caixa;
    JLabel rotulo, exibir;
    JButton mostrar;
    
    public SenhaDigitada(){
        super("Exemplo com JPassworField");
        Container tela = getContentPane();
        
        setSize(400,250);
        setVisible(true);
        setLayout(null);
            
        
        // Componentes rotulo:
        rotulo = new JLabel("Rotulo");
        rotulo.setBounds(50,20,80,20);
        
        // Componente caixa:
        caixa = new JPasswordField(10);
        caixa.setBounds(50,60,200,20);
        
        // Componente exibir:
        exibir = new JLabel("A senha digitada é:");
        exibir.setBounds(50,120,80,20);
        exibir.setVisible(false);
        
        // Componente mostrar:
        mostrar = new JButton("Mostrar");
        mostrar.setBounds(150,100,80,20);
        // Evento:
        mostrar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String senha = new String(caixa.getPassword());
                    exibir.setVisible(true);
                    exibir.setText(senha);
                }
            }
        );
        
        // Adicionando os componentes a tela:
        tela.add(rotulo);
        tela.add(exibir);
        
        tela.add(caixa);
        
        tela.add(mostrar);
    }

    public static void main(String[] args) {
        SenhaDigitada app = new SenhaDigitada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
