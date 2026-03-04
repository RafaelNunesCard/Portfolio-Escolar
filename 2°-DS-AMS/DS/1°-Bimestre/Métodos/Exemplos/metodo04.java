package com.mycompany.metodo04;
import javax.swing.JOptionPane;

public class Metodo04 {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero:: "));
        
        if(RestoPorDois(num) == 0) {
            JOptionPane.showMessageDialog(null,"O numero e par. \n ");
        }
        else {
            JOptionPane.showMessageDialog(null,"O numero e impar. \n ");
        }   
    }
    
    static int RestoPorDois(int a) {
        return a % 2;
    }
}
