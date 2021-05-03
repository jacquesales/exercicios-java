package com.company;

import java.util.Scanner;

public class Pessoa {

    //Atributos
    String nome;
    Scanner endereco;
    String numero;

    // Constructors
    public Pessoa() {
    }
//    public Pessoa(String nome, Endereco endereco, String numero) {
//        this.nome = nome;
//        this.endereco = endereco;
//        this.numero = numero;
//    }

    // GET SET
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //    public Scanner getEndereco() {
//        return endereco;
//    }
//    public void setEndereco(Scanner endereco) {
//        this.endereco = endereco;
//    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Métodos
//    Endereco consultaEndereco() {
//        return
//    }
//    String consultaNome() {
//        return
//    }
}


