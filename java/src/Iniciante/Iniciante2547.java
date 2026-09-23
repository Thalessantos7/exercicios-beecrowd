package Iniciante;

import java.util.Scanner;

public class Iniciante2547 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int N = sc.nextInt(), Amin = sc.nextInt(), Amax = sc.nextInt(), cont = 0;

            for (int i = 0; i < N; i++) {

                int Ai = sc.nextInt();

                if (Ai >= Amin && Ai <= Amax) {

                    cont++;

                }

            }

            System.out.println(cont);

        }

        sc.close();

    }

}