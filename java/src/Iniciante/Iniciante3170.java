package Iniciante;

import java.util.Scanner;

public class Iniciante3170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int G = sc.nextInt();

        if (B >= G / 2) System.out.println("Amelia tem todas bolinhas!");
        else System.out.printf("Faltam %d bolinha(s)\n", G / 2 - B);

        sc.close();
    }
}