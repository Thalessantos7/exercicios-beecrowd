package Iniciante;

import java.util.Scanner;

public class Iniciante1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println((double) x / y);
            }
        }
    }
}