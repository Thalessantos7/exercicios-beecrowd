package Iniciante;

import java.util.Scanner;

public class Iniciante2006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(), quantCerto = 0;

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();

            if (a == t) {

                quantCerto++;

            }

            if (b == t) {

                quantCerto++;

            }

            if (c == t) {

                quantCerto++;

            }

            if (d == t) {

                quantCerto++;

            }

            if (e == t) {

                quantCerto++;

            }

        System.out.println(quantCerto);

        sc.close();

    }

}