package Iniciante;

import java.util.Scanner;

public class Iniciante1914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qt = sc.nextInt();

        for (int i = 0; i < qt; i++) {
            String jogador1 = sc.next(), escolha1 = sc.next();
            String jogador2 = sc.next(), escolha2 = sc.next();

            int n = sc.nextInt(), m = sc.nextInt();
            int soma = n + m;

            if (soma % 2 == 0) {
                if (escolha1.equals("PAR")) {
                    System.out.println(jogador1);
                } else {
                    System.out.println(jogador2);
                }
            } else {
                if (escolha1.equals("IMPAR")) {
                    System.out.println(jogador1);
                } else {
                    System.out.println(jogador2);
                }
            }
        }

        sc.close();
    }
}