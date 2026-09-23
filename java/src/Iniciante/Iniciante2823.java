package Iniciante;

import java.util.Scanner;

public class Iniciante2823 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double soma = 0;

        for (int i = 0; i < N; i++) {

            double C = sc.nextInt(), P = sc.nextInt();

            soma += C / P;

        }

        if (soma <= 1) System.out.println("OK");
        else System.out.println("FAIL");

        sc.close();

    }

}