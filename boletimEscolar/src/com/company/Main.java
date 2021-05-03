package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Professora professoraMatematica = new Professora("Maria", "Matematica", "123456789");
        Aluna alunaA = new Aluna();

        System.out.printf("Professora -> %s \nCurso -> %s", professoraMatematica.getNome(), professoraMatematica.getCurso());
        System.out.println("\nDigite a quantidade total de aulas ministradas: ");
        int quantAulas = input.nextInt();
        float calculoSalario = professoraMatematica.calcularSalario(quantAulas);
        professoraMatematica.setSalario(calculoSalario);
        System.out.printf("Salário: R$ %.2f",professoraMatematica.getSalario());

        System.out.println("\n-------------------------------------------------");

        System.out.println("Informe o nome da aluna: ");
        alunaA.setNome(input.nextLine());

        System.out.println("Digite a primeira nota de " + alunaA.getNome());
        alunaA.setNota1(input.nextFloat());

        System.out.println("Digite a segunda nota de " + alunaA.getNome());
        alunaA.setNota2(input.nextFloat());

        float calculoMedia = alunaA.calcularMedia();
        System.out.printf("A aluna %s obteve a média %.1f", alunaA.getNome(), calculoMedia);

        if (calculoMedia >= 7) {
            System.out.println("\nAluna aprovada!!");
        } else {
            System.out.println("\nAluna reprovada :(");
        }

        System.out.println("\n-----------------------FIM----------------------");
    }
}
