package Iniciante;

import java.util.Scanner;

public class Iniciante2813 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int compradosCasa = 0, compradosEscritorio = 0;
        int guardadosCasa = 0, guardadosEscritorio = 0;

        for (int i = 0; i < N; i++) {

            String ida = sc.next(), volta = sc.next();

            if (ida.equals("chuva")) {

                if (guardadosCasa > 0) guardadosCasa--;
                else compradosCasa++;

                guardadosEscritorio++;

            }

            if (volta.equals("chuva")) {

                if (guardadosEscritorio > 0) guardadosEscritorio--;
                else compradosEscritorio++;

                guardadosCasa++;

            }

        }

        System.out.println(compradosCasa + " " + compradosEscritorio);

        sc.close();

    }

}