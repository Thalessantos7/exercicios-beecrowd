package Iniciante;

import java.util.Scanner;

public class Iniciante2685 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int m = sc.nextInt();

            if ((m >= 0 && m < 90) || m == 360) {

                System.out.println("Bom Dia!!");

            } else if (m < 180) {

                System.out.println("Boa Tarde!!");

            } else if (m < 270) {

                System.out.println("Boa Noite!!");

            } else {

                System.out.println("De Madrugada!!");

            }

        }

        sc.close();

    }

}