package Iniciante;

import java.util.Scanner;

public class Iniciante3209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int somaTomadas = 0;

            for (int j = 0; j < k; j++) {
                somaTomadas += sc.nextInt();
            }

            int maxAparelhos = somaTomadas - (k - 1);

            System.out.println(maxAparelhos);
        }

        sc.close();
    }
}