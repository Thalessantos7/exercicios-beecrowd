package Iniciante;

import java.util.Scanner;

public class Iniciante2715 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int n = sc.nextInt();

            int[] v = new int[n];
            long total = 0;

            for (int i = 0; i < n; i++) {

                v[i] = sc.nextInt();
                total += v[i];

            }

            long somaRangel = 0;
            long menor = Long.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {

                somaRangel += v[i];
                long somaGugu = total - somaRangel;
                long diferenca = Math.abs(somaRangel - somaGugu);

                if (diferenca < menor) {

                    menor = diferenca;

                }

            }

            System.out.println(menor);

        }

        sc.close();

    }

}