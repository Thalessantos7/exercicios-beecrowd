package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2029 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        while (sc.hasNext()) {

            double volume = sc.nextDouble();
            double diametro = sc.nextDouble();

            double raio = diametro / 2.0;

            double area = 3.14 * raio * raio;

            double altura = volume / area;

            System.out.printf("ALTURA = %.2f%n", altura);
            System.out.printf("AREA = %.2f%n", area);

        }

        sc.close();

    }

}