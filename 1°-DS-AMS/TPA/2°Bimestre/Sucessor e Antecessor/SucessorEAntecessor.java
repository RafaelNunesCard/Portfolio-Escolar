/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucessoreantecessor;

import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
import javax.swing.JOptionPane;
public class SucessorEAntecessor {

    public static void main(String[] args) {
        int numero = 0,antecessor = 0, sucessor = 0;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
            antecessor = numero - 1;
            sucessor = numero + 1;
            JOptionPane.showMessageDialog(null, "Voce escolheu o numero: " + numero);
            JOptionPane.showMessageDialog(null, "O numero antecessor é o: " + antecessor);
            JOptionPane.showMessageDialog(null, "O numero sucessor é o: " + sucessor);
    }
}

