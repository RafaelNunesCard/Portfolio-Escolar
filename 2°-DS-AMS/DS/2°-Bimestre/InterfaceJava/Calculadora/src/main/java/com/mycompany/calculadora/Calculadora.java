package com.mycompany.calculadora;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Calculadora extends JFrame {
    JLabel rotulo1,rotulo2,exibir;
    JTextField texto1, texto2;
    JButton proximo,voltar;
    JButton somar,subtrair,multiplicar,dividir,raiz;
    
    public Calculadora(){
        // Configurações da Tela:
        super("Calculadora");
        Container tela = getContentPane();
        
        setSize(450,280);
        setVisible(true);
        setLayout(null);
        
        
        // Componente rotulo1:
        rotulo1 = new JLabel("1° Numero:");
        rotulo1.setBounds(50, 60, 100, 20);
        
        
        // Componente rotulo2:
        rotulo2 = new JLabel("2° Numero:");
        rotulo2.setBounds(50, 100, 100, 20);
        
        
        // Componente texto1:
        texto1 = new JTextField(5);
        texto1.setBounds(120, 60, 200, 20);
        
        
        // Componente texto2:
        texto2 = new JTextField(5);
        texto2.setBounds(120, 100, 200, 20);
        
        
        // Componente exibir:
        exibir = new JLabel("");
        exibir.setBounds(50,200,200,20);
        
        
        //componente Proximo:
        proximo = new JButton("Proximo >>");
        proximo.setBounds(310,200,100,20);
        
        proximo.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo2.setVisible(false);
                        texto2.setVisible(false);
                        
                        somar.setVisible(false);
                        subtrair.setVisible(false);
                        multiplicar.setVisible(false);
                        dividir.setVisible(false);
                        proximo.setVisible(false);
                        
                        voltar.setVisible(true);
                        raiz.setVisible(true);
                        
                        exibir.setVisible(false);
                    }
                }
        );
        proximo.setVisible(true);
        
        
        //componente Voltar:
        voltar = new JButton("<< Voltar");
        voltar.setBounds(310,200,100,20);
        
        voltar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo2.setVisible(true);
                        texto2.setVisible(true);
                        
                        somar.setVisible(true);
                        subtrair.setVisible(true);
                        multiplicar.setVisible(true);
                        dividir.setVisible(true);
                        proximo.setVisible(true);
                        
                        voltar.setVisible(false);
                        raiz.setVisible(false);
                        
                        exibir.setVisible(false);
                    }
                }
        );
        voltar.setVisible(false);
        
        
        //componente Somar:
        somar = new JButton("Somar");
        somar.setBounds(50,160,80,20);
        
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
        
        
        //componente Subtrair:
        subtrair = new JButton("Subtrair");
        subtrair.setBounds(140,160,80,20);
        
        subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1, numero2,subtracao;
                        subtracao = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        subtracao = numero1 - numero2;
                        exibir.setVisible(true);
                        exibir.setText("A subtracao é: " + subtracao);
                    }
                }
        );
        
        
        //componente Multiplicar:
        multiplicar = new JButton("Multiplicar");
        multiplicar.setBounds(230,160,80,20);
        
        multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1, numero2,multiplicacao;
                        multiplicacao = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        multiplicacao = numero1 * numero2;
                        exibir.setVisible(true);
                        exibir.setText("A multiplicacao é: " + multiplicacao);
                    }
                }
        );
        
        
        //componente Dividir:
        dividir = new JButton("Dividir");
        dividir.setBounds(320,160,80,20);
        
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double numero1, numero2,divisao;
                        divisao = 0;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());
                        if(numero2 == 0 || numero1 == 0){
                            exibir.setVisible(true);
                            exibir.setText("Nao e possivel dividir zero!");
                            return;
                        }
                        divisao = numero1 / numero2;
                        exibir.setVisible(true);
                        exibir.setText("A divisao é: " + divisao);
                    }
                }
        );
        
        
        //componente Raiz:
        raiz = new JButton("Raiz");
        raiz.setBounds(185,160,80,20);
        
        raiz.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1;
                        numero1 = Integer.parseInt(texto1.getText());
                        exibir.setVisible(true);
                        exibir.setText("A subtracao é: " + Math.sqrt(numero1));
                    }
                }
        );
        raiz.setVisible(false);
        
        
        // Adicionando componentes na Tela:
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        
        tela.add(texto1);
        tela.add(texto2);
        
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(raiz);
        
        tela.add(proximo);
        tela.add(voltar);
    }

    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
