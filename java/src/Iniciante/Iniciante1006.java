package Iniciante;

import java.util.Scanner;

public class Iniciante1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        System.out.printf("MEDIA = %.1f%n", (a * 2.0 + b * 3.0 + c * 5.0) / 10.0);
    }
}