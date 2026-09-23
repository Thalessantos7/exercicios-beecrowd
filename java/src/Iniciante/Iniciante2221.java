package Iniciante;

import java.util.Scanner;

public class Iniciante2221 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            int B = sc.nextInt();
            int dabriel, guarte;

            int Ai = sc.nextInt(), Di = sc.nextInt(), Li = sc.nextInt();
            int Ai2 = sc.nextInt(), Di2 = sc.nextInt(), Li2 = sc.nextInt();

            dabriel = (Ai + Di) / 2;
            guarte = (Ai2 + Di2) / 2;

            if (Li % 2 == 0) {

                dabriel += B;

            }

            if (Li2 % 2 == 0) {

                guarte += B;

            }

            if (dabriel > guarte) {

                System.out.println("Dabriel");

            } else if (guarte > dabriel) {

                System.out.println("Guarte");

            } else {

                System.out.println("Empate");

            }

        }

        sc.close();

    }

}