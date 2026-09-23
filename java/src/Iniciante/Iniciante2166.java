package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2166 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double x = 0.0;

        for (int i = 0; i < n; i++) {

            x = 1.0 / (2.0 + x);

        }

        double resultado = 1.0 + x;

        System.out.printf("%.10f\n", resultado);

        sc.close();

    }

}