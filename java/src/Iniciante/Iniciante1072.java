package Iniciante;

import java.util.Scanner;

public class Iniciante1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), in = 0, out = 0;

        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();

            if (valor >= 10 && valor <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in\n" + out + " out");
    }
}