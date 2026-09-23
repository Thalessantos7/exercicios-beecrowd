package Iniciante;

import java.util.Scanner;

public class Iniciante2702 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Ca = sc.nextInt(), Ba = sc.nextInt(), Pa = sc.nextInt(), soma = 0;
        int Cr = sc.nextInt(), Br = sc.nextInt(), Pr = sc.nextInt();

        if (Cr > Ca) {

            soma += Cr - Ca;

        }

        if (Br > Ba) {

            soma += Br - Ba;

        }

        if (Pr > Pa) {

            soma += Pr - Pa;

        }

        System.out.println(soma);

        sc.close();

    }

}