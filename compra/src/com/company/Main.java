package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produto produto1 = new Produto(778899, "Geladeira", 3500.00);
        Produto produto2 = new Produto(445566, "Microondas", 800.00);

        Pessoa usuario = new Pessoa();
        Endereco end = new Endereco();
        Compra compra = new Compra();

        System.out.println("-------------- Olá!! Vamos realizar um breve cadastro ----------------");

        System.out.println("Digite seu nome: ");
        usuario.setNome(input.nextLine());
        System.out.println("Digite seu logradouro: ");
        end.setLogradouro(input.nextLine());
        System.out.println("Digite o número: ");
        usuario.setNumero(input.nextLine());
        System.out.println("Digite sua cidade: ");
        end.setCidade(input.nextLine());
        System.out.println("Digite seu estado: ");
        end.setEstado(input.nextLine());

        System.out.println("\nCadastro concluído! Obrigada :) \nSeu nome: "+usuario.getNome()+" \nEndereço: "+end.getLogradouro()+", "+usuario.getNumero()+" "+end.getCidade()+" "+end.getEstado());
        System.out.println("\nAgora selecione o numero do produto que deseja comprar: (1 ou 2)");
        System.out.printf("Produto 1 %s  Valor R$ %.2f  \n" +
                "Produto 2 %s  Valor R$ %.2f \n", produto1.getNome(),produto1.getValor(),produto2.getNome(),produto2.getValor());
        int idProduto = input.nextInt();

        if (idProduto == 1) {
            compra.comprar(compra.getPessoa(), compra.getProduto());
            System.out.printf("Produto: %s Valor %.2f: ",produto1.getNome(),produto1.getValor());
        } else if (idProduto == 2) {
            compra.comprar(compra.getPessoa(), compra.getProduto());
            System.out.printf("Produto: %s Valor %.2f: ",produto2.getNome(),produto2.getValor());
        } else {
            System.out.println("Digite um numero valido por favor");
        }
    }
}
