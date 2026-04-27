/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Soma extends JFrame {
    JLabel rotulo1,rotulo2,exibir;
    JTextField texto1, texto2;
    JButton somar;
    
    public Soma(){
        // Configurações da Tela:
        super("Soma");
        Container tela = getContentPane();
        
        setSize(500,250);
        setVisible(true);
        setLayout(null);
        
        // Componente rotulo1:
        rotulo1 = new JLabel("1° Numero:");
        rotulo1.setBounds(50, 20, 100, 20);
        
        // Componente rotulo2:
        rotulo2 = new JLabel("2° Numero:");
        rotulo2.setBounds(50, 60, 100, 20);
        
        // Componente texto1:
        texto1 = new JTextField(5);
        texto1.setBounds(120, 20, 200, 20);
        
        // Componente texto2:
        texto2 = new JTextField(5);
        texto2.setBounds(120, 60, 200, 20);
        
        // Componente exibir:
        exibir = new JLabel("");
        exibir.setBounds(50,120,200,20);
        
        //componente Somar:
        somar = new JButton("Somar");
        somar.setBounds(150,100,80,20);
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1, numero2,soma;
                        soma = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        soma = numero1 + numero2;
                        exibir.setVisible(true);
                        exibir.setText("A soma é: " + soma);
                    }
                }
        );
        
        // Adicionando componentes na Tela:
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        
        tela.add(texto1);
        tela.add(texto2);
        
        tela.add(somar);
    }

    public static void main(String[] args) {
        Soma app = new Soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
