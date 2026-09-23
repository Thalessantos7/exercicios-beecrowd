package Iniciante;

import java.util.Scanner;

public class Iniciante1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c;

        if (a == b) {
            c = a;
        } else {
            c = Math.max(a, b);
        }

        System.out.println(c);

        sc.close();
    }
}