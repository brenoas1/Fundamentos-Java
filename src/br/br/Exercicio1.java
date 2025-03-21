package br.br;
import java.util.Scanner;
import java.time.Year;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita o ano de nascimento
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Calcula a idade
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        // Exibe a mensagem formatada
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        scanner.close();
    }
}
