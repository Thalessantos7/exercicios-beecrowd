package Iniciante;

import java.util.Scanner;

public class Iniciante2235 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if ((A == B) || (A == C) || (B == C) || (A + B == C) || (A + C == B) || (B + C == A)) {

            System.out.println("S");

        } else {

            System.out.println("N");

        }

        sc.close();

    }

}