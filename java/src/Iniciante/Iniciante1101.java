package Iniciante;

import java.util.Scanner;

public class Iniciante1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt(), n = sc.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }

            int menor = Math.min(m, n), maior = Math.max(m, n), soma = 0;

            for (int i = menor; i < maior + 1; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);
        }
    }
}