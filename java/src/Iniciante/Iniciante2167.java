package Iniciante;

import java.util.Scanner;

public class Iniciante2167 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rpm = new int[n];

        for (int i = 0; i < n; i++) {

            rpm[i] = sc.nextInt();

        }

        int resposta = 0;

        for (int i = 1; i < n; i++) {

            if (rpm[i] < rpm[i - 1]) {

                resposta = i + 1;

                break;

            }

        }

        System.out.println(resposta);

        sc.close();

    }

}