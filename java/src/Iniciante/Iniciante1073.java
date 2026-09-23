package Iniciante;

import java.util.Scanner;

public class Iniciante1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^2 = " + i * i + "%n", i);
            }
        }
    }
}