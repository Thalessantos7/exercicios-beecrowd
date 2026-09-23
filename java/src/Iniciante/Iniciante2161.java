package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2161 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double valor = 0.0;

        for (int i = 0; i < n; i++) {

            valor = 1.0 / (6.0 + valor);

        }

        valor += 3.0;

        System.out.printf("%.10f\n", valor);

        sc.close();

    }

}