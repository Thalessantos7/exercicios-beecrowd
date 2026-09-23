package Iniciante;

import java.util.Scanner;

public class Iniciante1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            int valor = sc.nextInt();

            if (valor <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = valor;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("X[" + i + "] = " + vetor[i]);
        }
    }
}