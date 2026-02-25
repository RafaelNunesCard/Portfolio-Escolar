package com.mycompany.modulo02;

import javax.swing.JOptionPane;
public class modulo02 {

    public static void main(String[] args){
        int t;
        String p;
        p = digite();
        t = tamanho(p);
        JOptionPane.showMessageDialog(null, p + " possui "+ t + " caracteres");
    }

    static String digite() {
        return JOptionPane.showInputDialog(null, "Digite uma palavra qualquer: ");
    }

    static int tamanho(String x) {
        return x.length();
    }
}