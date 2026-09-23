package Iniciante;

import java.util.Scanner;

public class Iniciante2139 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] diasMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (sc.hasNext()) {

            int mes = sc.nextInt(), dia = sc.nextInt(), totalDias = 0;

            for (int i = 0; i < mes - 1; i++) {

                totalDias += diasMes[i];

            }

            totalDias += dia;
            int natal = 360;
            int faltam = natal - totalDias;

            if (faltam == 0) {

                System.out.println("E natal!");

            } else if (faltam == 1) {

                System.out.println("E vespera de natal!");

            } else if (faltam < 0) {

                System.out.println("Ja passou!");

            } else {

                System.out.println("Faltam " + faltam + " dias para o natal!");

            }

        }

        sc.close();

    }

}