package Iniciante;

import java.util.Scanner;

public class Iniciante1435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while ((n = sc.nextInt()) != 0) {
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int valor = i;
                    if (j < valor) valor = j;
                    if (n - 1 - i < valor) valor = n - 1 - i;
                    if (n - 1 - j < valor) valor = n - 1 - j;

                    if (j == 0) {
                        output.append(String.format("%3d", valor + 1));
                    } else {
                        output.append(String.format(" %3d", valor + 1));
                    }
                }

                output.append("\n");
            }

            System.out.println(output.toString());
        }
    }
}