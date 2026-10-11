package Iniciante;

import java.util.Scanner;

public class Iniciante3204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] dp = new int[15][31][31];
        dp[0][15][15] = 1;

        int[][] direcoes = {
                {1, 0},
                {1, -1},
                {0, -1},
                {-1, 0},
                {-1, 1},
                {0, 1}
        };

        for (int passos = 1; passos <= 14; passos++) {
            for (int x = 1; x < 30; x++) {
                for (int y = 1; y < 30; y++) {
                    for (int[] dir : direcoes) {
                        dp[passos][x][y] += dp[passos - 1][x + dir[0]][y + dir[1]];
                    }
                }
            }
        }

        if (sc.hasNextInt()) {
            int casosTeste = sc.nextInt();

            for (int i = 0; i < casosTeste; i++) {
                int n = sc.nextInt();

                System.out.println(dp[n][15][15]);
            }
        }

        sc.close();
    }
}