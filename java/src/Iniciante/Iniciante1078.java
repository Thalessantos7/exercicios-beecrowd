package Iniciante;

import java.util.Scanner;

public class Iniciante1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = " + i * valor + "%n", i, valor);
        }
    }
}