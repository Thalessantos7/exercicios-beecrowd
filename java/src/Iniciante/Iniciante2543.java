package Iniciante;

import java.util.Scanner;

public class Iniciante2543 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int N = sc.nextInt(), I = sc.nextInt(), cont = 0;

            for (int i = 0; i < N; i++) {

                int id = sc.nextInt(), j = sc.nextInt();

                if (id == I) {

                    if (j == 0) {

                        cont++;

                    }

                }

            }

            System.out.println(cont);

        }

        sc.close();

    }

}