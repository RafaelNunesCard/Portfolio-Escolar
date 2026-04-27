package com.mycompany.teladerg;

/**
 *
 * @author rafael
 */
import javax.swing.*;
import java.awt.*;
public class TelaDeRG extends JFrame {
    JLabel titulo,rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7;
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7;
    
    public TelaDeRG(){
        // Janela:
        super("Janela de RG");
        Container tela = getContentPane();
        tela.setBackground(Color.blue);
        
        setSize(800, 750);
        setVisible(true);
        setLayout(null);
        
        // Componente Titulo:
        titulo = new JLabel ("Cadastro de Cliente");
        titulo.setBounds(250,10,250,20);
        titulo.setForeground(Color.red);
        titulo.setFont(new Font("Arial",Font.BOLD,24));
        
        // Componente Rotulo1:
        rotulo1 = new JLabel ("Nome");
        rotulo1.setBounds(50,40,80,20);
        rotulo1.setForeground(Color.black);
        rotulo1.setFont(new Font("Arial",Font.BOLD,16));   
        
        // Componente texto1:
        texto1 = new JTextField(200);
        texto1.setBounds(50,60,80,20);
        
        
        // Componente Rotulo2:
        rotulo2 = new JLabel ("CPF");
        rotulo2.setBounds(50,90,80,20);
        rotulo2.setForeground(Color.black);
        rotulo2.setFont(new Font("Arial",Font.BOLD,16));
        
        // Componente texto2:
        texto2 = new JTextField(200);
        texto2.setBounds(50,110,80,20);
        
        
        // Componente Rotulo3:
        rotulo3 = new JLabel ("RG");
        rotulo3.setBounds(50,140,80,20);
        rotulo3.setForeground(Color.black);
        rotulo3.setFont(new Font("Arial",Font.BOLD,16));
        
        // Componente texto3:
        texto3 = new JTextField(200);
        texto3.setBounds(50,160,80,20);
        
        
        // Componente Rotulo4:
        rotulo4 = new JLabel ("Endereço");
        rotulo4.setBounds(50,190,80,20);
        rotulo4.setForeground(Color.black);
        rotulo4.setFont(new Font("Arial",Font.BOLD,16));
        
        // Componente texto4:
        texto4 = new JTextField(200);
        texto4.setBounds(50,210,80,20);
        
        
        // Componente Rotulo5:
        rotulo5 = new JLabel ("Cidade");
        rotulo5.setBounds(50,240,80,20);
        rotulo5.setForeground(Color.black);
        rotulo5.setFont(new Font("Arial",Font.BOLD,16));
        
        // Componente texto5:
        texto5 = new JTextField(200);
        texto5.setBounds(50,260,80,20);
        
        
        // Componente Rotulo6:
        rotulo6 = new JLabel ("Estado");
        rotulo6.setBounds(50,290,80,20);
        rotulo6.setForeground(Color.black);
        rotulo6.setFont(new Font("Arial",Font.BOLD,16));
        
        // Componente texto6:
        texto6 = new JTextField(200);
        texto6.setBounds(50,310,80,20);
        
        
        // Componente Rotulo7:
        rotulo7 = new JLabel ("CEP:");
        rotulo7.setBounds(50,340,80,20);
        rotulo7.setForeground(Color.black);
        rotulo7.setFont(new Font("Arial",Font.BOLD,16));
        
        // Componente texto7:
        texto7 = new JTextField(200);
        texto7.setBounds(50,360,80,20);
        
        
        // Adicionando na tela:
        tela.add(titulo);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
    }

    public static void main(String[] args) {
        TelaDeRG app = new TelaDeRG();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
