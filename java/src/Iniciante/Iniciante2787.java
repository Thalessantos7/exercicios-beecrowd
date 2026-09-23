package Iniciante;

import java.util.Scanner;

public class Iniciante2787 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();

        if (L % 2 != 0) {

            if (C % 2 != 0) {

                System.out.println(1);

            } else {

                System.out.println(0);

            }

        } else {

            if (C % 2 != 0) {

                System.out.println(0);

            } else {

                System.out.println(1);

            }

        }

        sc.close();

    }

}