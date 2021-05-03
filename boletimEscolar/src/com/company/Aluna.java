package com.company;

public class Aluna {

    private String nome;
    private float nota1;
    private float nota2;

    public Aluna() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    float calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
