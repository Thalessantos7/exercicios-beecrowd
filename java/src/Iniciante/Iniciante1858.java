package Iniciante;

import java.util.Scanner;

public class Iniciante1858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int menorValor = Integer.MAX_VALUE;
        int resposta = 1;

        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();

            if (t < menorValor) {
                menorValor = t;
                resposta = i;
            }
        }

        System.out.println(resposta);
    }
}