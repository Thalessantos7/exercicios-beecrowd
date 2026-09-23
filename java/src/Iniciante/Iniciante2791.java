package Iniciante;

import java.util.Scanner;

public class Iniciante2791 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pos = 0;

        for (int i = 1; i <= 4; i++) {

            int C = sc.nextInt();

            if (C == 1) {

                pos = i;

            }

        }

        System.out.println(pos);

        sc.close();

    }

}