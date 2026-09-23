package Iniciante;

import java.util.Scanner;

public class Iniciante2552 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int N = sc.nextInt(), M = sc.nextInt();

            int[][] tab = new int[N][M];

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < M; j++) {

                    tab[i][j] = sc.nextInt();

                }

            }

            int[][] resp = new int[N][M];

            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < M; j++) {

                    if (tab[i][j] == 1) {

                        resp[i][j] = 9;

                    } else {

                        int cont = 0;

                        for (int k = 0; k < 4; k++) {

                            int ni = i + dx[k];
                            int nj = j + dy[k];

                            if (ni >= 0 && ni < N && nj >= 0 && nj < M) {

                                if (tab[ni][nj] == 1) {

                                    cont++;

                                }

                            }

                        }

                        resp[i][j] = cont;

                    }

                }

            }

            for (int i = 0; i < N; i++) {

                for (int j = 0; j < M; j++) {

                    System.out.print(resp[i][j]);

                }

                System.out.println();

            }

        }

        sc.close();

    }

}