package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante1963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double percentual = ((B - A) / A) * 100;

        System.out.printf("%.2f%%\n", percentual);

        sc.close();
    }
}