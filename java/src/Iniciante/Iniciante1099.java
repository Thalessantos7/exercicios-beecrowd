package Iniciante;

import java.util.Scanner;

public class Iniciante1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            int menor = Math.min(x, y), maior = Math.max(x, y), soma = 0;

            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);
        }
    }
}