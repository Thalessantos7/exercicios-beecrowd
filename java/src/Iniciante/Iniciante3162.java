package Iniciante;

import java.util.Scanner;

public class Iniciante3162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] naves = new int[n][3];

        for (int i = 0; i < n; i++) {
            naves[i][0] = sc.nextInt();
            naves[i][1] = sc.nextInt();
            naves[i][2] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double distanciaMinima = Double.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double distancia = Math.sqrt(
                            Math.pow(naves[i][0] - naves[j][0], 2) +
                                    Math.pow(naves[i][1] - naves[j][1], 2) +
                                    Math.pow(naves[i][2] - naves[j][2], 2)
                    );

                    if (distancia < distanciaMinima) distanciaMinima = distancia;
                }
            }

            if (distanciaMinima <= 20) System.out.println("A");
            else if (distanciaMinima <= 50) System.out.println("M");
            else System.out.println("B");
        }

        sc.close();
    }
}