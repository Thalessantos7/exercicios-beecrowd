package Iniciante;

import java.util.Scanner;

public class Iniciante1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            if (i % x == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}