package Iniciante;

import java.util.Scanner;

public class Iniciante1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(), soma = 0, maior = Math.max(x, y), menor = Math.min(x, y);

        for (int i = menor; i < maior + 1; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}