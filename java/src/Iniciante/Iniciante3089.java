package Iniciante;

import java.util.Scanner;

public class Iniciante3089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;

        while (sc.hasNextInt()) {
            sb = new StringBuilder();
            int n = sc.nextInt();

            if (n == 0) break;

            int[] presentes = new int[2 * n];

            for (int i = 0; i < 2 * n; i++) {
                presentes[i] = sc.nextInt();
            }

            int maiorPar = Integer.MIN_VALUE;
            int menorPar = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int soma = presentes[i] + presentes[2 * n - 1 - i];

                maiorPar = Math.max(maiorPar, soma);
                menorPar = Math.min(menorPar, soma);
            }

            sb.append(maiorPar)
                    .append(' ')
                    .append(menorPar)
                    .append('\n');

            System.out.print(sb);
        }
        
        sc.close();
    }
}