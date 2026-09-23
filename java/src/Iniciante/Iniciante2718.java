package Iniciante;

import java.util.Scanner;

public class Iniciante2718 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            long x = sc.nextLong();

            int atual = 0;
            int maior = 0;

            while (x > 0) {

                if ((x & 1) == 1) {

                    atual++;

                    if (atual > maior) {

                        maior = atual;

                    }

                } else {

                    atual = 0;

                }

                x >>= 1;

            }

            System.out.println(maior);

        }

        sc.close();

    }

}