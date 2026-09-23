package Iniciante;

import java.util.Scanner;

public class Iniciante2963 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {

            int n = sc.nextInt();

            int votosCarlos = sc.nextInt();
            boolean eleito = true;

            for (int i = 1; i < n; i++) {

                int votosOutro = sc.nextInt();

                if (votosOutro > votosCarlos) eleito = false;

            }

            System.out.println((eleito) ? "S" : "N");

        }

        sc.close();

    }

}