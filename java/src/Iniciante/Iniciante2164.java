package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2164 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        double fibonacciN = ( Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n) ) / ( Math.sqrt(5) );

        System.out.printf("%.1f%n", fibonacciN);

        sc.close();

    }

}