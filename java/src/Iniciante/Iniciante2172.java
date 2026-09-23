package Iniciante;

import java.util.Scanner;

public class Iniciante2172 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int x = sc.nextInt();
            long m = sc.nextLong();

            if (x == 0 || m == 0) {

                break;

            }

            System.out.println(x * m);

        }

        sc.close();

    }

}