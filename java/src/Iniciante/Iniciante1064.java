package Iniciante;

import java.util.Scanner;

public class Iniciante1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();

            if (valor > 0) {
                soma += valor;
                cont += 1;
            }
        }

        double media = soma / cont;

        System.out.printf("%d valores positivos%n%.1f%n", cont, media);
    }
}