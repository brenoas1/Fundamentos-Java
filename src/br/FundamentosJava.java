package br;

import java.util.Scanner;

public class FundamentosJava {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);



    }
}
