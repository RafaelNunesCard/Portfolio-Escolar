/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojformattedtextfield;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class ExemploJFormattedTextField extends JFrame {
    
    JLabel rotuloCep, rotuloTel, rotuloCpf, rotuloData;
    JFormattedTextField cep, tel, cpf, data;
    MaskFormatter mascaraCep, mascaraTel, mascaraCpf, mascaraData;
    
    public ExemploJFormattedTextField(){
        super("Exemplo com JFormattedTextField");
        Container tela = getContentPane();
        
        setSize(500,250);
        setVisible(true);
        setLayout(null);
        
        // Rotulos:
        rotuloCep = new JLabel("CEP:");
        rotuloCep.setBounds(50,40,100,20);
        
        rotuloTel = new JLabel("Telefone:");
        rotuloTel.setBounds(50,80,100,20);
        
        rotuloCpf = new JLabel("CPF:");
        rotuloCpf.setBounds(50,120,100,20);
        
        rotuloData = new JLabel("Data:");
        rotuloData.setBounds(50,160,100,20);
        
        //Mascara de Formatação:
        try{
            
        }catch(ParseException excp){
            
        }
        
        
    }

    public static void main(String[] args) {
        ExemploJFormattedTextField app = new ExemploJFormattedTextField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
