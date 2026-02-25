package com.mycompany.modulo01;

import javax.swing.JOptionPane;
public class modulo01 {

    public static void main(String[] args){
        int a;
        a = Integer.parseInt(digite());
        dobro(a);
    }

    static String digite() {
        return JOptionPane.showInputDialog("Digite um número: ");
    }

    static void dobro(int n) {
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "Dobro de "+ n +" é "+ d);
    }
}
    