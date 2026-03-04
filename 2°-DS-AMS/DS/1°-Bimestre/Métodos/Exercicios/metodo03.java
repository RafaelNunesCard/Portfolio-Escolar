package com.mycompany.metodo03;
import javax.swing.JOptionPane;

public class Metodo03 {

    public static void main(String[] args){
        double altura;
        String sexo;
        
        altura = Double.parseDouble(lerValor("Digite sua altura: "));
            
        JOptionPane.showMessageDialog(null, "Digite M para homem e F para mulher");
        sexo = lerValor("Digite seu sexo: ").toLowerCase();
        
        String texto = calcularPesoIdeal(altura, sexo);
        
        JOptionPane.showMessageDialog(null, texto);
    }

    static String lerValor(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    static String calcularPesoIdeal(double altura, String sexo) {
        double calculo;
        switch(sexo){
            case "m" -> {
                calculo = (72.7 * altura) - 58;
                return  "Peso ideal masculino: " + calculo;
            }
            case "f" -> {
                calculo = (62.1 * altura) - 44.7;
                return "Peso ideal feminino: " + calculo;
            }
            default -> {
                return "Digitou errado";
            }
        }
    }
}