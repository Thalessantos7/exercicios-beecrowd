package Iniciante;

import java.util.Scanner;

public class Iniciante2551 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int N = sc.nextInt();

            int Tmax = 0, Dmax = 0;

            for (int i = 1; i <= N; i++) {

                int T = sc.nextInt(), D = sc.nextInt();

                if (i == 1) {

                    System.out.println(1);

                    Tmax = T;
                    Dmax = D;

                } else {

                    if ((long) D * Tmax > (long) Dmax * T) {

                        System.out.println(i);

                        Tmax = T;
                        Dmax = D;

                    }

                }

            }

        }

        sc.close();

    }

}