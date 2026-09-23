package Iniciante;

import java.util.Scanner;

public class Iniciante2163 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                mat[i][j] = sc.nextInt();

            }

        }

        int x = 0, y = 0;

        for (int i = 1; i < n - 1; i++) {

            for (int j = 1; j < m - 1; j++) {

                if (mat[i][j] == 42) {

                    boolean sabre = mat[i-1][j-1] == 7 &&
                                    mat[i-1][j] == 7 &&
                                    mat[i-1][j+1] == 7 &&
                                    mat[i][j-1] == 7 &&
                                    mat[i][j+1] == 7 &&
                                    mat[i+1][j-1] == 7 &&
                                    mat[i+1][j] == 7 &&
                                    mat[i+1][j+1] == 7;

                    if (sabre) {

                        x = i + 1;
                        y = j + 1;

                    }

                }

            }

        }

        System.out.println(x + " " + y);

        sc.close();

    }

}