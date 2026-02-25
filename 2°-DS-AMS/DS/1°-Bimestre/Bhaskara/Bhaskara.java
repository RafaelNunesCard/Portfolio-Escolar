package com.mycompany.bhaskara;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bhaskara {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Vamos calcular Bhaskara");
        System.out.println("Por favor digite o valor de A: ");
        double a = leia.nextDouble();
        
        System.out.println("Por favor digite o valor de B: ");
        double b = leia.nextDouble();
        
        System.out.println("Por favor digite o valor de C: ");
        double c = leia.nextDouble();
        
        double quadrado = Math.pow(b,2);
        double delta = quadrado - 4 * a * c;
        
        if(delta < 0){
            System.out.println("Vai dar errado pois o delta nao pode ser menor que 0");
            return;
        }
 
        double x1 = ((- b) - Math.sqrt(delta)) / 2 * a;
        
        double x2 = ((- b) + Math.sqrt(delta)) / 2 * a;
        
        System.out.printf("Resolucao: x1 = %.2f e x2 = %.2f", x1 ,x2);
    }
}