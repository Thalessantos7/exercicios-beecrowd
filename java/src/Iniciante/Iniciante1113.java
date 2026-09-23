package Iniciante;

import java.util.Scanner;

public class Iniciante1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt(), y = sc.nextInt();

            if (x == y) {
                break;
            }

            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }
}