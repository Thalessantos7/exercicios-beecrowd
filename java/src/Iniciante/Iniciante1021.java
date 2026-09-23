package Iniciante;

import java.util.Scanner;

public class Iniciante1021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int qtd = centavos / notas[i];
            centavos %= notas[i];
            System.out.printf("%d nota(s) de R$ %.2f\n", qtd, notas[i] / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int qtd = centavos / moedas[i];
            centavos %= moedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtd, moedas[i] / 100.0);
        }
    }
}