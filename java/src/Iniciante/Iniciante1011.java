package Iniciante;

import java.util.Scanner;

public class Iniciante1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        System.out.printf("VOLUME = %.3f%n", (4/3.0) * 3.14159 * Math.pow(raio, 3));
    }
}