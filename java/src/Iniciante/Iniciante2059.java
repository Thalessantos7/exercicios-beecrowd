package Iniciante;

import java.util.Scanner;

public class Iniciante2059 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt(), j1 = sc.nextInt(), j2 = sc.nextInt(), r = sc.nextInt(), a = sc.nextInt();

        if (r == 1 && a == 1) {

            System.out.println("Jogador 2 ganha!");

        } else if (r == 1 && a == 0) {

            System.out.println("Jogador 1 ganha!");

        } else if (r == 0 && a == 1) {

            System.out.println("Jogador 1 ganha!");

        } else {

            int soma = j1 + j2;
            boolean somaEhPar = soma % 2 == 0;
            boolean jogador1EscolheuPar = p == 1;

            if (somaEhPar == jogador1EscolheuPar) {

                System.out.println("Jogador 1 ganha!");

            } else {

                System.out.println("Jogador 2 ganha!");

            }

        }

        sc.close();

    }

}