package Iniciante;

import java.util.Scanner;

public class Iniciante2630 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {

            String tipo = sc.next();
            int R = sc.nextInt(), G = sc.nextInt(), B = sc.nextInt();
            int P = 0;

            switch (tipo) {

                case "min":

                    P = Math.min(R, Math.min(G, B));

                    break;

                case "max":

                    P = Math.max(R, Math.max(G, B));

                    break;

                case "mean":

                    P = (R + G + B) / 3;

                    break;

                case "eye":

                    P = (int) (0.30 * R + 0.59 * G + 0.11 * B);

                    break;

            }

            System.out.println("Caso #" + i + ": " + P);

        }

        sc.close();

    }

}