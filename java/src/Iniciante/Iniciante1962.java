package Iniciante;

import java.util.Scanner;

public class Iniciante1962 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            long T = sc.nextLong();

            long ano = 2015 - T;

            if (ano > 0) {
                System.out.println(ano + " D.C.");
            } else {
                long anoAC = 1 - ano;
                System.out.println(anoAC + " A.C.");
            }
        }

        sc.close();
    }
}