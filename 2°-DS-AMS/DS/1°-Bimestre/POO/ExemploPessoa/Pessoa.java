package com.mycompany.pessoa;

public class Pessoa{
    String nome;
    String sexo;
    String pais;

    void Anda() {
        System.out.println(nome + " está andando ");
    }

    void Fala() {
        System.out.println(nome + "- oi");
    }

    void Corre() {
        System.out.println(nome + " está correndo");
    }

    void Estuda() {
        System.out.println(nome + " estudando");
    }

    void Brinca() {
        System.out.println(nome + " brincando");
    }
}