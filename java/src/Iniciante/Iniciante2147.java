package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2147 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {

            String palavra = sc.next();

            double t = palavra.length() * 0.01;

            System.out.printf("%.2f%n", t);

        }

        sc.close();

    }

}