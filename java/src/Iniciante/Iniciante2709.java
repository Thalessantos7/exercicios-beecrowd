package Iniciante;

import java.util.Scanner;

public class Iniciante2709 {

    public static boolean ehPrimo(int n) {

        if (n < 2) {

            return false;

        }

        if (n == 2) {

            return true;

        }

        if (n % 2 == 0) {

            return false;

        }

        for (int i = 3; i * i <= n; i += 2) {

            if (n % i == 0) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int M = sc.nextInt();

            int[] moedas = new int[M];

            for (int i = 0; i < M; i++) {

                moedas[i] = sc.nextInt();

            }

            int N = sc.nextInt();
            int soma = 0;

            for (int i = M - 1; i >= 0; i -= N) {

                soma += moedas[i];

            }

            if (ehPrimo(soma)) {

                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");

            } else {

                System.out.println("Bad boy! I’ll hit you.");

            }
        }

        sc.close();

    }

}