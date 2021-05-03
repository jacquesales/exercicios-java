package com.company;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private Conta conta;

    //como o unico atributo(conta) é que preciso realmente ter criado depois pra add na Main, vamos criar um constructor
    //que permite criar um objeto pessoa já com todos atributos, pra qd criar conta eu só add o num da conta
    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
