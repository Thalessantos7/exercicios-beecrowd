package Iniciante;

import java.util.Scanner;

public class Iniciante2143 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int t = sc.nextInt();

            if (t == 0) {

                break;

            }

            for (int i = 0; i < t; i++) {

                int n = sc.nextInt(), total;

                if (n % 2 != 0) {

                    total = 1 + (n - 1) * 2;

                } else {

                    total = 2 + (n - 2) * 2;

                }

                System.out.println(total);

            }

        }

        sc.close();

    }

}