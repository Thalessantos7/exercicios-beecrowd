package Iniciante;

import java.util.Scanner;

public class Iniciante1184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op = sc.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double valor = sc.nextDouble();
                matriz[i][j] = valor;
            }
        }

        double soma = 0;
        int cont = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
                cont++;
            }
        }

        if (op == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / cont);
        }
    }
}