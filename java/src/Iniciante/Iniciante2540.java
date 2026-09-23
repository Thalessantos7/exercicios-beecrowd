package Iniciante;

import java.util.Scanner;

public class Iniciante2540 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int n = sc.nextInt(), favoraveis = 0;

            for (int i = 0; i < n; i++) {

                favoraveis += sc.nextInt();

            }

            if (3 * favoraveis >= 2 * n) {

                System.out.println("impeachment");

            } else {

                System.out.println("acusacao arquivada");

            }

        }

        sc.close();

    }

}