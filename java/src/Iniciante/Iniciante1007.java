package Iniciante;

import java.util.Scanner;

public class Iniciante1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        System.out.printf("DIFERENCA = %d%n", a*b - c*d);
    }
}