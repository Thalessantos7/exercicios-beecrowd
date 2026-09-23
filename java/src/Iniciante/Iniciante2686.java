package Iniciante;

import java.util.Scanner;

public class Iniciante2686 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble()) {

            double m = sc.nextDouble();

            int totalSeg = (int) (m * 240.0 + 1e-9);
            int h = (6 + totalSeg / 3600) % 24;
            int min = (totalSeg % 3600) / 60;
            int s = totalSeg % 60;

            if (h >= 6 && h < 12) {

                System.out.println("Bom Dia!!");

            } else if (h >= 12 && h < 18) {

                System.out.println("Boa Tarde!!");

            } else if (h >= 18) {

                System.out.println("Boa Noite!!");

            } else {

                System.out.println("De Madrugada!!");

            }

            System.out.printf("%02d:%02d:%02d%n", h, min, s);

        }

        sc.close();

    }

}