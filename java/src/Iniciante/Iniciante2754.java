package Iniciante;

import java.util.Locale;
import java.text.DecimalFormat;

public class Iniciante2754 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double a = 234.345;
        double b = 45.698;

        System.out.printf("%.6f - %.6f\n", a, b);
        System.out.printf("%.0f - %.0f\n", a, b);
        System.out.printf("%.1f - %.1f\n", a, b);
        System.out.printf("%.2f - %.2f\n", a - 0.001, b);
        System.out.printf("%.3f - %.3f\n", a, b);
        System.out.printf("%.6e - %.6e\n", a, b);
        System.out.printf("%.6E - %.6E\n", a, b);

        DecimalFormat df = new DecimalFormat("0.###");

        System.out.println(df.format(a) + " - " + df.format(b));
        System.out.println(df.format(a) + " - " + df.format(b));

    }

}