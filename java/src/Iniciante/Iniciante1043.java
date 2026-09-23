package Iniciante;

import java.util.Scanner;

public class Iniciante1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        if ((b + c) > a && (a + c) > b && (a + b) > c) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = (a + b) * c / 2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}