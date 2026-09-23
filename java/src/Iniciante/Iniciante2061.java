package Iniciante;

import java.util.Scanner;

public class Iniciante2061 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        for (int i = 0; i < m; i++) {

            String acao = sc.next();

            if (acao.equals("fechou")) {

                n++;

            } else {

                n--;

            }

        }

        System.out.println(n);

        sc.close();

    }

}