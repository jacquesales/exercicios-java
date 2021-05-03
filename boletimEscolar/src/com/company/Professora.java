package com.company;

import java.util.ArrayList;

public class Professora {
    private String nome;
    private String curso;
    private String cpf;
    private float salario;
    private String listaDeAlunos[];

    public Professora(String nome, String curso, String cpf) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String[] getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(String[] listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public float calcularSalario(int quantAulas) {
        return this.salario += 29 * quantAulas;
    }
}
