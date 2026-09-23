package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2159 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n = sc.nextDouble();

        double p = n / Math.log(n);
        double m = 1.25506 * p;

        System.out.printf("%.1f %.1f\n", p, m);

        sc.close();

    }

}