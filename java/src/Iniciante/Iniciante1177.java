package Iniciante;

import java.util.Scanner;

public class Iniciante1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(), cont = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + cont);

            if (cont == t - 1) {
                cont = 0;
            } else {
                cont++;
            }
        }
    }
}