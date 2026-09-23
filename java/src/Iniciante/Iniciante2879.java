package Iniciante;

import java.util.Scanner;

public class Iniciante2879 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int vitorias = 0;

        for (int i = 0; i < N; i++) {

            int portaDoCarro = sc.nextInt();

            if (portaDoCarro != 1) vitorias++;

        }

        System.out.println(vitorias);

        sc.close();

    }

}