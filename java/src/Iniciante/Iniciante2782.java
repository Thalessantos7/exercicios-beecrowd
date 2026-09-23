package Iniciante;

import java.util.Scanner;

public class Iniciante2782 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 2) {

            System.out.println(1);

            return;

        }

        int anterior = sc.nextInt();
        int atual = sc.nextInt();

        int diferenca = atual - anterior;
        int escadinhas = 1;

        for (int i = 2; i < n; i++) {

            anterior = atual;
            atual = sc.nextInt();

            int novaDiferenca = atual - anterior;

            if (novaDiferenca != diferenca) {

                escadinhas++;
                diferenca = novaDiferenca;

            }

        }

        System.out.println(escadinhas);

        sc.close();

    }

}