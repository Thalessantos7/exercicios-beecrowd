package Iniciante;

import java.util.Scanner;

public class Iniciante2152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdCasos = sc.nextInt();

        for (int i = 0; i < qtdCasos; i++) {

            int h = sc.nextInt(), m = sc.nextInt(), o = sc.nextInt();

            System.out.printf("%02d:%02d - ", h, m);

            if (o == 0) {

                System.out.println("A porta fechou!");

            } else {

                System.out.println("A porta abriu!");

            }

        }

        sc.close();

    }

}