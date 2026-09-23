package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2234 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double H = sc.nextDouble(), P = sc.nextDouble();

        System.out.printf("%.2f%n", (H / P));

        sc.close();

    }

}