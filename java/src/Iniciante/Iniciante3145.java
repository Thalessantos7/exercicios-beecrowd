package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante3145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double N = sc.nextInt();
        double X = sc.nextInt();

        System.out.printf("%.2f\n", X / (N + 2));

        sc.close();
    }
}