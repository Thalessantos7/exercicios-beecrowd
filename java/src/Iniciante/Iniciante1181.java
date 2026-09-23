package Iniciante;

import java.util.Scanner;

public class Iniciante1181 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int l = sc.nextInt();
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
            soma += matriz[l][i];
        }

        if (op == 'S') {
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma / 12);
        }
    }
}