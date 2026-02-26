package com.mycompany.exemplocarro;

/**
 *
 * @author Rafael
 */
public class ExemploCarro {

    public static void main(String[] args) {
        Carro umCarro = new Carro();
        
        umCarro.modelo = "Gol";
        umCarro.cor = "preto";
        umCarro.motor = "1.0";
        
        umCarro.ligar();
        umCarro.desligar();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.mudarMarcha();
        
        System.out.println("Cor:"+umCarro.cor);
        System.out.println("Modelo:"+umCarro.modelo);
        System.out.println("Motor:"+umCarro.motor);
    }
}