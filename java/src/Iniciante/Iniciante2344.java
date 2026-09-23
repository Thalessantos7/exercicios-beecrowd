package Iniciante;

import java.util.Scanner;

public class Iniciante2344 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {

            System.out.println("E");

        } else if (n >= 1 && n <= 35) {

            System.out.println("D");

        } else if (n >= 36 && n <= 60) {

            System.out.println("C");

        } else if (n >= 61 && n <= 85) {

            System.out.println("B");

        } else {

            System.out.println("A");

        }

        sc.close();

    }

}