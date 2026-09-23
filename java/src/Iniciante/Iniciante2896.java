package Iniciante;

import java.util.Scanner;

public class Iniciante2896 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            int resultado = (N % K) + (N / K);

            System.out.println(resultado);

        }

        sc.close();

    }

}