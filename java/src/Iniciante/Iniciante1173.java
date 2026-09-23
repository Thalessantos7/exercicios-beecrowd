package Iniciante;

import java.util.Scanner;

public class Iniciante1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int valor = sc.nextInt();
        vetor[0] = valor;

        for (int i = 1; i < 10; i++) {
            valor *= 2;
            vetor[i] = valor;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
    }
}