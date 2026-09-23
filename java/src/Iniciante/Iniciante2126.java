package Iniciante;

import java.util.Scanner;

public class Iniciante2126 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caso = 1;

        while (sc.hasNext()) {

            String n1 = sc.next(), n2 = sc.next();

            int qtd = 0, ultimaPos = -1;

            for (int i = 0; i <= n2.length() - n1.length(); i++) {

                if (n2.substring(i, i + n1.length()).equals(n1)) {

                    qtd++;
                    ultimaPos = i + 1;

                }

            }

            System.out.println("Caso #" + caso + ":");

            if (qtd == 0) {

                System.out.println("Nao existe subsequencia");

            } else {

                System.out.println("Qtd.Subsequencias: " + qtd);
                System.out.println("Pos: " + ultimaPos);

            }

            System.out.println();

            caso++;

        }

        sc.close();

    }

}