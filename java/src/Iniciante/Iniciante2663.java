package Iniciante;

import java.util.*;

public class Iniciante2663 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] notas = new Integer[N];

        for (int i = 0; i < N; i++) {

            notas[i] = sc.nextInt();

        }

        Arrays.sort(notas, Collections.reverseOrder());

        int notaCorte = notas[K - 1];
        int classificados = 0;

        for (int nota : notas) {

            if (nota >= notaCorte) {

                classificados++;

            }

        }

        System.out.println(classificados);

        sc.close();

    }

}