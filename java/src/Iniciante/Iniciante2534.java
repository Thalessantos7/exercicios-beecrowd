package Iniciante;

import java.util.*;

public class Iniciante2534 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int N = sc.nextInt(), Q = sc.nextInt();

            Integer[] notas = new Integer[N];

            for (int i = 0; i < N; i++) {

                notas[i] = sc.nextInt();

            }

            Arrays.sort(notas, Collections.reverseOrder());

            for (int i = 0; i < Q; i++) {

                int p = sc.nextInt();
                System.out.println(notas[p - 1]);

            }

        }

        sc.close();

    }

}