package Iniciante;

import java.util.Scanner;

public class Iniciante1182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        char op = sc.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double valor = sc.nextDouble();
                matriz[i][j] = valor;
            }
        }

        double soma = 0;

        for (int i = 0; i < 12; i++) {
            soma += matriz[i][c];
        }

        if (op == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / 12);
        }
    }
}