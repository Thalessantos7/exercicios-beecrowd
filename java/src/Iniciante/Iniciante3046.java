package Iniciante;

import java.util.Scanner;

public class Iniciante3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalPecas = ((n + 1) * (n + 2)) / 2;

        System.out.println(totalPecas);

        sc.close();
    }
}