package Iniciante;

import java.util.Scanner;

public class Iniciante3147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int E = sc.nextInt();
        int A = sc.nextInt();
        int O = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt();

        int ladoBem = H + E + A + X;
        int ladoMal = O + W;

        if (ladoBem > ladoMal) System.out.println("Middle-earth is safe.");
        else System.out.println("Sauron has returned.");

        sc.close();
    }
}