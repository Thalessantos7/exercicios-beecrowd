package Iniciante;

import java.util.Scanner;

public class Iniciante2712 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String placa = sc.nextLine();

            if (!placa.matches("[A-Z]{3}-\\d{4}")) {

                System.out.println("FAILURE");
                continue;

            }

            char ultimo = placa.charAt(7);

            switch (ultimo) {

                case '1':
                case '2':

                    System.out.println("MONDAY");

                    break;

                case '3':
                case '4':

                    System.out.println("TUESDAY");

                    break;

                case '5':
                case '6':

                    System.out.println("WEDNESDAY");

                    break;

                case '7':
                case '8':

                    System.out.println("THURSDAY");

                    break;

                case '9':
                case '0':

                    System.out.println("FRIDAY");

                    break;

            }

        }

        sc.close();

    }

}