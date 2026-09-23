package Iniciante;

import java.util.Scanner;

public class Iniciante1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();

            if (valor == 0) {
                System.out.println("NULL");
            } else {
                if (valor % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }

                if (valor > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
    }
}