package Iniciante;

import java.util.Scanner;

public class Iniciante2140 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] notas = {2, 5, 10, 20, 50, 100};

        while (true) {

            int n = sc.nextInt(), m = sc.nextInt();

            if (n == 0 && m == 0) {

                break;

            }

            int troco = m - n;
            boolean possivel = false;

            for (int i = 0; i < notas.length; i++) {

                for (int j = i; j < notas.length; j++) {

                    if (notas[i] + notas[j] == troco) {

                        possivel = true;

                    }

                }

            }

            if (possivel) {

                System.out.println("possible");

            } else {

                System.out.println("impossible");

            }

        }

        sc.close();

    }

}