package Iniciante;

import java.util.Scanner;

public class Iniciante1557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int maior = 1 << (2 * n - 2);
            int largura = String.valueOf(maior).length();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int valor = 1 << (i + j);

                    if (j == 0) {
                        System.out.printf("%" + largura + "d", valor);
                    } else {
                        System.out.printf(" %" + largura + "d", valor);
                    }
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}