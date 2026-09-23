package Iniciante;

import java.util.Scanner;

public class Iniciante2544 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {

            long n = sc.nextLong();
            int cont = 0;

            while (n > 1) {

                n /= 2;

                cont++;

            }

            System.out.println(cont);

        }

        sc.close();

    }

}