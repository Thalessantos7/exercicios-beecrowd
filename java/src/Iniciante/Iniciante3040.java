package Iniciante;

import java.util.Scanner;

public class Iniciante3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int h = sc.nextInt(), d = sc.nextInt(), g = sc.nextInt();

            if ((h >= 200) && (h <= 300) && (d >= 50) && (g >= 150)) System.out.println("Sim");
            else System.out.println("Nao");
        }

        sc.close();
    }
}