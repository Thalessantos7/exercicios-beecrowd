package Iniciante;

import java.util.Scanner;

public class Iniciante3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = m - (a + b);
        int filhoMaisVelho = Math.max(a, Math.max(b, c));

        System.out.println(filhoMaisVelho);

        sc.close();
    }
}