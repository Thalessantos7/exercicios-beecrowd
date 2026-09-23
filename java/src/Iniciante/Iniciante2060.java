package Iniciante;

import java.util.Scanner;

public class Iniciante2060 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mult2 = 0, mult3 = 0, mult4 = 0, mult5 = 0;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0) {

                mult2++;

            }

            if (num % 3 == 0) {

                mult3++;

            }

            if (num % 4 == 0) {

                mult4++;

            }

            if (num % 5 == 0) {

                mult5++;

            }

        }

        System.out.println(
                mult2 + " Multiplo(s) de 2\n" +
                mult3 + " Multiplo(s) de 3\n" +
                mult4 + " Multiplo(s) de 4\n" +
                mult5 + " Multiplo(s) de 5"
        );

        sc.close();

    }

}