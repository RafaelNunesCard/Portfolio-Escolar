/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idadeemdias;

/**
 *
 * @author Pichau
 */
import javax.swing.JOptionPane;
public class IdadeEmDias {

    public static void main(String[] args) {
        {
            int a = 0, b = 0, c = 0, d = 0, r = 0;
            a = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano que vc naceu:"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Insira o Mês: "));
            c = Integer.parseInt(JOptionPane.showInputDialog("Insira o Dia: "));
            r = ((2025-a) * 365)+(b * 30)+(c * 1);
            JOptionPane.showMessageDialog(null, "O resultado é: " + r + " Dias na Terra");
        }
    }
}
