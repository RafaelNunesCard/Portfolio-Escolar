/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustedesaldo;

/**
 *
 * @author Pichau
 */
import javax.swing.JOptionPane;
public class ReajusteDeSaldo {

    public static void main(String[] args) {
        
            double a = 0, reajuste = 0.01, r = 0;
            a = Integer.parseInt(JOptionPane.showInputDialog("Insira o Seu saldo: "));
            r = a - a * reajuste;
            JOptionPane.showMessageDialog(null, "O resultado é: " + r);
    }
}
