package Iniciante;

import java.util.Scanner;

public class Iniciante2520 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int N = sc.nextInt(), M = sc.nextInt();

            int r1 = 0, c1 = 0;
            int r2 = 0, c2 = 0;

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < M; j++) {

                    int x = sc.nextInt();

                    if (x == 1) {

                        r1 = i;
                        c1 = j;

                    } else if (x == 2) {

                        r2 = i;
                        c2 = j;

                    }

                }

            }

            int tempo = Math.abs(r1 - r2) + Math.abs(c1 - c2);

            System.out.println(tempo);

        }

        sc.close();

    }

}