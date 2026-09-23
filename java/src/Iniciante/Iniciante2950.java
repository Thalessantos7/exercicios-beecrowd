package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2950 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int distancia = sc.nextInt(), diametroSauron = sc.nextInt(), diametroSaruman = sc.nextInt();

        double icm = (double) distancia / (diametroSauron + diametroSaruman);

        System.out.printf("%.2f\n", icm);

        sc.close();

    }

}