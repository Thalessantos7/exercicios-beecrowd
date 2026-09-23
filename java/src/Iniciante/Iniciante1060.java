package Iniciante;

import java.util.Scanner;

public class Iniciante1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contPositivos = 0;

        for (int i = 1; i <= 6; i++) {
            double num = sc.nextDouble();

            if (num > 0) {
                contPositivos++;
            }
        }

        System.out.println(contPositivos + " valores positivos");
    }
}