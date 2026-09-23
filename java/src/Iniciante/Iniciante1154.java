package Iniciante;

import java.util.Scanner;

public class Iniciante1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma, cont;
        soma = cont = 0;

        while (true) {
            int idade = sc.nextInt();

            if (idade < 0) {
                break;
            }

            soma += idade;
            cont++;
        }

        System.out.printf("%.2f%n", (double) soma / cont);
    }
}