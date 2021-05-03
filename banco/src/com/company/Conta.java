package com.company;

public class Conta {
    private int numero;
    private String tipo;
    private String cliente;
    private double saldo;

    public Conta() {

    }

    public Conta(String tipo, double saldo) {
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }


    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = saldo - valor;
            return true;
        }
        return false;
    }
    public void transferir(double valor) {
        System.out.println("Valor transferido");
        this.saldo += valor;
    }

}
