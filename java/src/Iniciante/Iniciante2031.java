package Iniciante;

import java.util.Scanner;

public class Iniciante2031 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String j1 = sc.nextLine();
            String j2 = sc.nextLine();

            if (j1.equals("ataque") && j2.equals("ataque")) {

                System.out.println("Aniquilacao mutua");

            } else if (j1.equals("pedra") && j2.equals("pedra")) {

                System.out.println("Sem ganhador");

            } else if (j1.equals("papel") && j2.equals("papel")) {

                System.out.println("Ambos venceram");

            } else if (j1.equals("ataque")) {

                System.out.println("Jogador 1 venceu");

            } else if (j2.equals("ataque")) {

                System.out.println("Jogador 2 venceu");

            } else if (j1.equals("pedra")) {

                System.out.println("Jogador 1 venceu");

            } else {

                System.out.println("Jogador 2 venceu");

            }

        }

        sc.close();

    }

}