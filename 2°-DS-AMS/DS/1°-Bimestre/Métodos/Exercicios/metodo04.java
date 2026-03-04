package com.mycompany.metodo04;
import javax.swing.JOptionPane;

public class Metodo04 {

    public static void main(String[] args){
        int escolha;
        double res = 0;
        
        JOptionPane.showMessageDialog(null, """
                                            1-Soma
                                            2-Subtracao
                                            3-Divisaoã
                                            4-Multiplicacao
                                            5-Resto da Divisao
                                            6-Dobro
                                            7-Quadrado
                                            8-Cubo
                                            9-Raiz Quadrada
                                            0-Sair
                                            """);
        escolha = Integer.parseInt(lerValor("Digite o numero da sua escolha: "));
        
        switch(escolha) {
            case 0 -> JOptionPane.showMessageDialog(null,"Finalizando operacao");
            case 1 -> res = soma();
            case 2 -> res =subtracao();
            case 3 -> res = divisao();
            case 4 -> res = multiplicacao();
            case 5 -> res = restoDivisao();
            case 6 -> res = dobro();
            case 7 -> res = quadrado();
            case 8 -> res = cubo();
            case 9 -> res = raizQuadrada();
            default -> JOptionPane.showMessageDialog(null,"Opcao invalida");
        }
        JOptionPane.showMessageDialog(null,res);
    }

    static String lerValor(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    static double soma() {
        double num1 = Double.parseDouble(lerValor("Digite o 1° numero: "));
        double num2 = Double.parseDouble(lerValor("Digite o 2° numero: "));
        
        return num1 + num2;
    }
    
    static double subtracao() {
        double num1 = Double.parseDouble(lerValor("Digite o 1° numero: "));
        double num2 = Double.parseDouble(lerValor("Digite o 2° numero: "));
        
        return num1 - num2;
    }
    
    static double divisao() {
        double num1 = Double.parseDouble(lerValor("Digite o 1° numero: "));
        double num2 = Double.parseDouble(lerValor("Digite o 2° numero: "));
        
        if(num2 == 0){
            JOptionPane.showMessageDialog(null, "Nao pode dividir por zero");
            return 0;
        }   
        
        return num1 / num2;
    }
    
    static double multiplicacao() {
        double num1 = Double.parseDouble(lerValor("Digite o 1° numero: "));
        double num2 = Double.parseDouble(lerValor("Digite o 2° numero: "));
        
        return num1 * num2;
    }
    
    static int restoDivisao() {
        int num1 = Integer.parseInt(lerValor("Digite um numero: "));
        
        return num1 % 2;
    }
    
    static int dobro() {
        int num1 = Integer.parseInt(lerValor("Digite um numero: "));
        
        return num1 * 2;
    }
    
    static int quadrado() {
        int num1 = Integer.parseInt(lerValor("Digite um numero: "));
        
        return num1 * num1;
    }
    
    static int cubo() {
        int num1 = Integer.parseInt(lerValor("Digite um numero: "));
        
        return num1 * num1 * num1;
    }
    
    static double raizQuadrada() {
        int num1 = Integer.parseInt(lerValor("Digite um numero: "));
        
        return Math.sqrt(num1);
    }
}