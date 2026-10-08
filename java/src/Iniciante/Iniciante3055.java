package Iniciante;

import java.util.Scanner;

public class Iniciante3055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int M = sc.nextInt();

        int B = 2 * M - A;

        System.out.println(B);

        sc.close();
    }
}