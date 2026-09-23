package Iniciante;

import java.util.Scanner;

public class Iniciante2162 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {

            h[i] = sc.nextInt();

        }

        boolean valido = true;

        for (int i = 1; i < n - 1; i++) {

            if (h[i] == h[i - 1]) {

                valido = false;
                break;

            }

            if ((h[i] > h[i - 1] && h[i] > h[i + 1]) || (h[i] < h[i - 1] && h[i] < h[i + 1])) {

                continue;

            } else {

                valido = false;

                break;

            }

        }

        if (h[n - 1] == h[n - 2]) {

            valido = false;

        }

        System.out.println(valido ? 1 : 0);

        sc.close();

    }

}