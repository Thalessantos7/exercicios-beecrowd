package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante3146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        double R = sc.nextDouble();

        System.out.printf("%.2f\n", R * 2 * 3.14);

        sc.close();
    }
}