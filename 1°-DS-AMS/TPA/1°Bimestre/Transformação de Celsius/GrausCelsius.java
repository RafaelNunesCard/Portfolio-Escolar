/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grauscelsius;

/**
 *
 * @author Pichau
 */
import java.util.Scanner;

public class GrausCelsius {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
       System.out.print("Digite a temperatuda em Celsius: " );
       double Celsius = scanner.nextDouble();
       
       double Fahrenheit = (Celsius * 9/5) + 32;
               
       double Kelvin = Celsius + 273.15;
       
       System.out.println("Celsius: " + Celsius);
       
       System.out.println("Temperatura em Fahrenheit: " + Fahrenheit + "F");
       
       System.out.println("Temperatura em Kelvin: " + Kelvin + "K");
    }
}
