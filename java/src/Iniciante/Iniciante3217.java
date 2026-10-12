package Iniciante;

import java.util.Scanner;
import java.util.Locale;

public class Iniciante3217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        double l = sc.nextDouble();
        double k = sc.nextDouble();
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();
        double h = sc.nextDouble();

        double f1 = 0.0;
        double f2 = 0.0;

        if (h < l) {
            f1 = h;
            f2 = h;
        } else if (Math.abs(h - l) < 1e-7) {
            f1 = h;

            double b = -(l + k * (t1 + t2));
            double c = k * l * t1;

            double delta = Math.max(0.0, b * b - 4 * c);
            f2 = (-b + Math.sqrt(delta)) / 2.0;
        } else {
            double b = -(h + k * (t1 + t2));
            double c = k * l * t1;

            f1 = (-b + Math.sqrt(b * b - 4 * c)) / 2.0;
            f2 = f1;
        }

        System.out.printf("%.9f %.9f\n", f1, f2);

        sc.close();
    }
}