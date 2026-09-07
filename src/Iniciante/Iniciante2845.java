package Iniciante;

import java.util.Scanner;

public class Iniciante2845 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), maior = 0;

        for (int i = 0; i < N; i++) {

            int Ai = sc.nextInt();

            if (Ai > maior) maior = Ai;

        }

        System.out.println(maior + 1);

        sc.close();

    }

}