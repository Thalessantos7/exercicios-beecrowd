package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2533 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        while (sc.hasNextInt()) {

            int M = sc.nextInt();

            double somaNotas = 0;
            double somaCargas = 0;

            for (int i = 0; i < M; i++) {

                int N = sc.nextInt();
                int C = sc.nextInt();

                somaNotas += N * C;
                somaCargas += C;

            }

            double ira = somaNotas / (100.0 * somaCargas);

            System.out.printf("%.4f%n", ira);

        }

        sc.close();

    }

}