package Iniciante;

import java.util.Scanner;

public class Iniciante2780 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();

        System.out.println((D <= 800) ? 1 : (D > 800 && D <= 1400) ? 2 : 3);

        sc.close();

    }

}