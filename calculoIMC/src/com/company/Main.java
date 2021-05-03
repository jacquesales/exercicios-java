package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        float peso = teclado.nextFloat();
        System.out.println("Informe sua altura");
        float altura = teclado.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.1f", imc);

        if (imc < 19.1) {
            System.out.println(" - Abaixo do peso");
        } else if (imc >= 19.1 && imc <= 25.8) {
            System.out.println(" - Peso normal");
        } else if (imc > 25.8 && imc <= 27.3) {
            System.out.println(" - Marginalmente acima do peso");
        } else if (imc > 27.3 && imc <= 32.3) {
            System.out.println(" - Acima do peso ideal");
        } else {
            System.out.println(" - Obesidade");
        }
    }
}
