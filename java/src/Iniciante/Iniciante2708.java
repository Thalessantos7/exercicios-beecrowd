package Iniciante;

import java.util.Scanner;

public class Iniciante2708 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int turistas = 0;
        int jipes = 0;

        while (true) {

            String movimento = sc.next();

            if (movimento.equals("ABEND")) {

                break;

            }

            int t = sc.nextInt();

            if (movimento.equals("SALIDA")) {

                turistas += t;
                jipes++;

            } else if (movimento.equals("VUELTA")) {

                turistas -= t;
                jipes--;

            }

        }

        System.out.println(turistas);
        System.out.println(jipes);

        sc.close();

    }

}