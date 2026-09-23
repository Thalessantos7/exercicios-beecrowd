package Iniciante;

import java.util.Scanner;

public class Iniciante2802 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLong()) {

            long n = sc.nextLong();

            long regioes = 1 + (n * (n - 1)) / 2 + (n * (n - 1) * (n - 2) * (n - 3)) / 24;

            System.out.println(regioes);

        }

        sc.close();

    }

}