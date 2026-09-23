package Iniciante;

import java.util.Scanner;

public class Iniciante1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(), soma = 0;

        if (x == y) {
            System.out.println(0);
        } else {
            int menor = Math.min(x, y);
            int maior = Math.max(x, y);

            for (int i = menor + 1; i < maior; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            System.out.println(soma);
        }
    }
}