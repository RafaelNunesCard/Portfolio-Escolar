/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amediadasmedias;

/**
 *
 * @author Pichau
 */
import javax.swing.JOptionPane;
public class AMediaDasMedias {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Os numeros utilizados são Media 1: 8,9 e 7; Media 2: 4,5 e 6");
        int a = 8, b = 9, c = 7, d = 4, e = 5, f= 6,media1 = 0, media2 = 0, r = 0;
            media1= + (a + b + c )/3;
            media2= +(d + e + f)/3;
            r = +media1 + media2;
            JOptionPane.showMessageDialog(null, "Media 1: " + media1);
            JOptionPane.showMessageDialog(null, "Media 2: " + media2);
            JOptionPane.showMessageDialog(null, "O resultado é: " + r);
        }
    }
