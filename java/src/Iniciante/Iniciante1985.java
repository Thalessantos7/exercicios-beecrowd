package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante1985 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int p = sc.nextInt();
        double soma = 0;

        for (int i = 0; i < p; i++) {

            int numero = sc.nextInt(), q = sc.nextInt();

            if (numero == 1001) {

                soma += 1.50 * q;

            } else if (numero == 1002) {

                soma += 2.50 * q;

            } else if (numero == 1003) {

                soma += 3.50 * q;

            } else if (numero == 1004) {

                soma += 4.50 * q;

            } else {

                soma += 5.50 * q;

            }

        }

        System.out.printf("%.2f%n", soma);

        sc.close();

    }

}