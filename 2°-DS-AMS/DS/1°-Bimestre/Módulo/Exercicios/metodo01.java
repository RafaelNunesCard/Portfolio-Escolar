package com.mycompany.metodo01;
import javax.swing.JOptionPane;

public class Metodo01 {

    public static void main(String[] args){
        double nota1,nota2;
        
        nota1 = Integer.parseInt(lerNota());
        nota2 = Integer.parseInt(lerNota());
        
        String texto = calcularMedia(nota1, nota2);
        
        JOptionPane.showMessageDialog(null, texto);
    }

    static String lerNota() {
        return JOptionPane.showInputDialog("Digite a nota do aluno: ");
    }

    static String calcularMedia(double n1, double n2) {
        double media = (n1 + n2) / 2;
        if(media > 7){
            return "Aluno passou pois a media e " + media;
        }else {
            return "Aluno reprovou pois a media e " + media;
        }
    }
}
