package Iniciante;

import java.util.Scanner;

public class Iniciante1534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = 3;
                }
            }

            for (int i = 0; i < n; i++) {
                matriz[i][i] = 1;
            }

            for (int i = 0; i < n; i++) {
                matriz[i][n- 1 - i] = 2;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        }
    }
}