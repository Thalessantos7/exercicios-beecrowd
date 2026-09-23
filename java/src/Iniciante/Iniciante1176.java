package Iniciante;

import java.util.Scanner;

public class Iniciante1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fibonacci = new long[61];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= 60; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            System.out.println("Fib(" + n + ") = " + fibonacci[n]);
        }
    }
}