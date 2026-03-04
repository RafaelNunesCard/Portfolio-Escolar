package com.mycompany.metodo02;
import javax.swing.JOptionPane;

public class Metodo02 {

    public static void main(String[] args){
        double num1,num2;
        
        num1 = Integer.parseInt(lerValor());
        num2 = Integer.parseInt(lerValor());
        
        double texto = diferenca(num1, num2);
        
        JOptionPane.showMessageDialog(null, texto);
    }

    static String lerValor() {
        return JOptionPane.showInputDialog("Digite um numero: ");
    }

    static double diferenca(double n1, double n2) {
        
        if(n1 > n2){
            return n1 - n2 ;
        }else {
            return n2 -n1 ;
        }
    }
}
