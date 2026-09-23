package Iniciante;

import java.util.Scanner;

public class Iniciante2028 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caso = 1;

        while (sc.hasNextInt()) {

            int n = sc.nextInt();

            int totalNumeros = 1 + (n * (n + 1) / 2);

            String termoNumeros = (totalNumeros == 1) ? "numero" : "numeros";

            System.out.println("Caso " + caso + ": " + totalNumeros + " " + termoNumeros);

            StringBuilder sequencia = new StringBuilder();
            sequencia.append("0");

            for (int i = 1; i <= n; i++) {

                for (int j = 0; j < i; j++) {

                    sequencia.append(" ").append(i);

                }

            }

            System.out.println(sequencia.toString());
            System.out.println();

            caso++;

        }

        sc.close();

    }

}