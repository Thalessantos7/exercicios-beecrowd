package Iniciante;

import java.util.Scanner;

public class Iniciante2168 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] cameras = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n; j++) {

                cameras[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < n; i++) {

            StringBuilder linha = new StringBuilder();

            for (int j = 0; j < n; j++) {

                int soma = cameras[i][j] + cameras[i][j + 1] + cameras[i + 1][j] + cameras[i + 1][j + 1];

                if (soma >= 2) {

                    linha.append('S');

                } else {

                    linha.append('U');

                }

            }

            System.out.println(linha);

        }

        sc.close();

    }

}