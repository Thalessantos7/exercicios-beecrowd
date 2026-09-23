package Iniciante;

import java.util.Scanner;

public class Iniciante2757 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            System.out.printf("A = %d, B = %d, C = %d%n", A, B, C);

            System.out.printf("A = %10d, B = %10d, C = %10d%n", A, B, C);

            System.out.printf("A = %010d, B = %010d, C = %010d%n", A, B, C);

            System.out.printf("A = %-10d, B = %-10d, C = %-10d%n", A, B, C);

        }

        sc.close();

    }

}