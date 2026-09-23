package Iniciante;

import java.util.Scanner;

public class Iniciante2982 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int governo, universidade;
        governo = universidade = 0;

        for (int i = 0; i < N; i++) {

            char T = sc.next().charAt(0);
            int C = sc.nextInt();

            if (T == 'V') governo += C;
            else universidade += C;

        }

        if (governo >= universidade) System.out.println("A greve vai parar.");
        else System.out.println("NAO VAI TER CORTE, VAI TER LUTA!");

        sc.close();

    }

}