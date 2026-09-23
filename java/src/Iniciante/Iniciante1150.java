package Iniciante;

import java.util.Scanner;

public class Iniciante1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), z = sc.nextInt(), soma = 0, cont = 0;

        while (z <= x) {
            z = sc.nextInt();
        }

        while (soma <= z) {
            soma += x;
            x++;
            cont++;
        }

        System.out.println(cont);
    }
}