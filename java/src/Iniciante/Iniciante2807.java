package Iniciante;

import java.util.Scanner;

public class Iniciante2807 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] fib = new long[N];

        if (N >= 1) fib[0] = 1;
        if (N >= 2) fib[1] = 1;

        for (int i = 2; i < N; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];

        }

        for (int i = N - 1; i >= 0; i--) {

            if (i < N - 1) System.out.print(" ");

            System.out.print(fib[i]);

        }

        System.out.println();

        sc.close();

    }

}