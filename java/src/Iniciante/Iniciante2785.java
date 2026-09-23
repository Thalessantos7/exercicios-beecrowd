package Iniciante;

import java.util.Scanner;

public class Iniciante2785 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {

            return;

        }

        int n = sc.nextInt();
        int[][] peso = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                peso[i][j] = sc.nextInt();

            }
        }


        int[][] dp = new int[n][n];
        int somaBase = 0;

        for (int j = 0; j < n; j++) {

            somaBase += peso[n - 1][j];

        }

        dp[n - 1][0] = somaBase;

        for (int i = n - 2; i >= 0; i--) {

            int tamanho = i + 1;

            for (int j = 0; j <= n - tamanho; j++) {

                int pesoAtual = 0;

                for (int k = j; k < j + tamanho; k++) {

                    pesoAtual += peso[i][k];

                }

                if (j == 0) {

                    dp[i][j] = pesoAtual + dp[i + 1][j];

                } else if (j == n - tamanho) {

                    dp[i][j] = pesoAtual + dp[i + 1][j - 1];

                } else {

                    dp[i][j] = pesoAtual + Math.min(dp[i + 1][j], dp[i + 1][j - 1]);

                }

            }

        }

        int menorPeso = dp[0][0];

        for (int j = 1; j < n; j++) {

            if (dp[0][j] < menorPeso) {

                menorPeso = dp[0][j];

            }

        }

        System.out.println(menorPeso);

        sc.close();

    }

}