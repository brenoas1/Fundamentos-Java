package br;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do lado do quadrado
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        // Calcula a área do quadrado
        double area = lado * lado;

        // Exibe o resultado
        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}