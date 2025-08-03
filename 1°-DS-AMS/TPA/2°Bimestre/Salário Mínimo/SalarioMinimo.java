/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariominimo;

/**
 *
 * @author Pichau
 */
import javax.swing.JOptionPane;
public class SalarioMinimo {

    public static void main(String[] args) {
        int SM = 1000,salario = 0, r = 0;
            salario = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu salario: "));
            r= salario/SM;
            JOptionPane.showMessageDialog(null, "Voce ganha: " + r + " de um salario minimo");
    }
}
