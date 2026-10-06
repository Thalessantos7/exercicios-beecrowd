package Iniciante;

import java.util.Scanner;

public class Iniciante3037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int pontosJoao = 0;
            int pontosMaria = 0;

            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                int d = sc.nextInt();

                pontosJoao += (x * d);
            }

            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                int d = sc.nextInt();

                pontosMaria += (x * d);
            }

            if (pontosJoao > pontosMaria) System.out.println("JOAO");
            else System.out.println("MARIA");
        }

        sc.close();
    }
}