package Iniciante;

import java.util.Scanner;

public class Iniciante2542 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int N = sc.nextInt();

            int M = sc.nextInt();
            int L = sc.nextInt();

            long[][] marcos = new long[M][N];
            long[][] leonardo = new long[L][N];

            for (int i = 0; i < M; i++) {

                for (int j = 0; j < N; j++) {

                    marcos[i][j] = sc.nextLong();

                }

            }

            for (int i = 0; i < L; i++) {

                for (int j = 0; j < N; j++) {

                    leonardo[i][j] = sc.nextLong();

                }

            }

            int CM = sc.nextInt();
            int CL = sc.nextInt();

            int A = sc.nextInt();

            long valorMarcos = marcos[CM - 1][A - 1];
            long valorLeonardo = leonardo[CL - 1][A - 1];

            if (valorMarcos > valorLeonardo) {

                System.out.println("Marcos");

            } else if (valorLeonardo > valorMarcos) {

                System.out.println("Leonardo");

            } else {

                System.out.println("Empate");

            }

        }

        sc.close();

    }

}