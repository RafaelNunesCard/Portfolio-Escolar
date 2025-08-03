/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipi;

/**
 *
 * @author Pichau
 */
import javax.swing.JOptionPane;
public class IPI {

    public static void main(String[] args) {
        int valor1 = 0, quant1 = 0, valor2 = 0, quant2 = 0,ipi = 0, r = 0;
            ipi = Integer.parseInt(JOptionPane.showInputDialog("Insira a porcentagem do IPI: "));
            valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor unitario da peça 1: "));
            quant1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quntidade da peça 1: "));
            valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor unitario da peça 2: "));
            quant2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade da peça 2: "));
            r = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
            JOptionPane.showMessageDialog(null, "O resultado é: " + r);
    }
}
