package Iniciante;

import java.util.Scanner;

public class Iniciante1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(), cont = 0;

            for (int j = 1; j <= num * 2; j++) {
                if (num % j == 0) {
                    cont++;
                }
            }

            if (cont == 2) {
                System.out.println(num + " eh primo");
            } else {
                System.out.println(num + " nao eh primo");
            }
        }
    }
}