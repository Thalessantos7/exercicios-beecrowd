package Iniciante;

import java.util.Scanner;

public class Iniciante2862 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {

            int N = sc.nextInt();

            if (N > 8000) System.out.println("Mais de 8000!");
            else System.out.println("Inseto!");

        }

        sc.close();

    }

}