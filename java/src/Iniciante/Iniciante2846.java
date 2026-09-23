package Iniciante;

import java.util.Scanner;

public class Iniciante2846 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        long a = 1, b = 2;
        int count = 0;

        while (true) {

            long gap = b - a - 1;

            if (count + gap >= K) {

                System.out.println(a + (K - count));

                break;

            }

            count += gap;
            long nextFib = a + b;
            a = b;
            b = nextFib;

        }

        sc.close();

    }

}