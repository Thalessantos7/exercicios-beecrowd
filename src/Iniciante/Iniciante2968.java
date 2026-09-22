package Iniciante;

import java.util.Scanner;

public class Iniciante2968 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long v = sc.nextInt(), n = sc.nextInt();
        long totalPlacas = v * n;

        for (int i = 10; i <= 90; i += 10) {

            long resultado = (long) Math.ceil((totalPlacas * i) / 100.0);

            System.out.print(resultado + (i == 90 ? "\n" : " "));

        }

        sc.close();

    }

}