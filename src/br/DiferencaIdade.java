package br;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome e idade da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Solicita o nome e idade da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        // Calcula a diferença de idade
        int diferenca = Math.abs(idade1 - idade2);

        // Exibe o resultado
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");

        scanner.close();
    }
}