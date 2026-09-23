package Iniciante;

import java.util.Scanner;

public class Iniciante1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), n = sc.nextInt(), soma = 0;

        while (n <= 0) {
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma += a + i;
        }

        System.out.println(soma);
    }
}