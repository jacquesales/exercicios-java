package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Instanciando os objetos
        Cliente ana = new Cliente("Ana","123456789","Rua Tal, 45 Piraporinha SP");
        Cliente bruno = new Cliente("Bruno","445456789","Rua Um, 100 Guararema SP");
        Cliente zilda = new Cliente("Zilda","987456789","Rua Dois, 87 Mogi-Guaçu SP");

        Conta contaAna = new Conta("Corrente",50);
        Conta contaBruno = new Conta("Poupança",500);
        Conta contaZilda = new Conta("Corrente",1000);


        // Adicionando os valores das contas nos respectivos clientes (relação)
        ana.setConta(contaAna);
        bruno.setConta(contaBruno);
        zilda.setConta(contaZilda);

        //Pra não ter que setar tudo, um por um como abaixo, criar um constructor na Classe Cliente e definir os valores na instância do objeto
        /*ana.setNome("Ana");
        ana.setCpf("123456789");
        ana.setEndereco("Rua Tal, 45 Piraporinha SP");
        ana.setConta(contaAna);
        bruno.setNome("Bruno");
        bruno.setCpf("445456789");
        bruno.setEndereco("Rua Um, 100 Guararema SP");
        bruno.adicionarConta(contaBruno);
        zilda.setNome("Zilda");
        zilda.setCpf("987456789");
        zilda.setEndereco("Rua Dois, 87 Mogi-Guaçu SP");
        zilda.adicionarConta(contaZilda);*/


        System.out.println("Digite o valor do saque: ");
        double valorSaqueAna = input.nextDouble();
        boolean anaPodeSacar = ana.getConta().sacar(valorSaqueAna);
        if (anaPodeSacar == true) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo indisponível");
        }

        System.out.println("Digite o valor da transferencia: ");
        double valorSaqueBruno = input.nextDouble();
        boolean brunoPodeSacar = bruno.getConta().sacar(valorSaqueBruno);
        if (brunoPodeSacar == true) {
            System.out.println("Saque realizado com sucesso!");
            zilda.getConta().transferir(valorSaqueBruno);
        } else {
            System.out.println("Saldo indisponível");
        }

        System.out.println("Digite o valor do saque: ");
        double valorSaqueZilda = input.nextDouble();
        boolean zildaPodeSacar = zilda.getConta().sacar(valorSaqueZilda);
        if (zildaPodeSacar == true) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo indisponível");
        }

        System.out.printf("\nCliente %s. Saldo atual: R$ %.2f",ana.getNome(),ana.getConta().getSaldo());
        System.out.printf("\nCliente %s. Saldo atual: R$ %.2f",bruno.getNome(),bruno.getConta().getSaldo());
        System.out.printf("\nCliente %s. Saldo atual: R$ %.2f",zilda.getNome(),zilda.getConta().getSaldo());

    }
}
