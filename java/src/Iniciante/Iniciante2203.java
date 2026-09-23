package Iniciante;

import java.util.Scanner;

public class Iniciante2203 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int xf = sc.nextInt(), yf = sc.nextInt();
            int xi = sc.nextInt(), yi = sc.nextInt();
            int vi = sc.nextInt();
            int r1 = sc.nextInt(), r2 = sc.nextInt();

            double d = Math.sqrt(Math.pow(xi - xf, 2) + Math.pow(yi - yf, 2));
            double distanciaFinal = d + 1.5 * vi - r1;

            if (distanciaFinal <= r2) {

                System.out.println("Y");

            } else {

                System.out.println("N");

            }

        }

        sc.close();

    }

}