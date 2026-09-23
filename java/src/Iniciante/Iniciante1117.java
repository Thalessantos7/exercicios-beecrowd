package Iniciante;

import java.util.Scanner;

public class Iniciante1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double soma = 0;

        while (cont != 2) {
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                cont++;
                soma += nota;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / cont;

        System.out.printf("media = %.2f%n", media);
    }
}