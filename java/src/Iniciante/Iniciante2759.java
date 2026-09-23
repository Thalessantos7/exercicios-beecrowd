package Iniciante;

import java.util.Scanner;

public class Iniciante2759 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char A = sc.next().charAt(0);
        char B = sc.next().charAt(0);
        char C = sc.next().charAt(0);

        System.out.println("A = " + A + ", B = " + B + ", C = " + C);
        System.out.println("A = " + B + ", B = " + C + ", C = " + A);
        System.out.println("A = " + C + ", B = " + A + ", C = " + B);

        sc.close();

    }

}