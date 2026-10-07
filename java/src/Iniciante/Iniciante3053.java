package Iniciante;

import java.util.Scanner;

public class Iniciante3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char posicaoAtual = sc.next().charAt(0);

        for (int i = 0; i < n; i++) {
            int movimento = sc.nextInt();

            if (movimento == 1) {
                if (posicaoAtual == 'A') {
                    posicaoAtual = 'B';
                } else if (posicaoAtual == 'B') {
                    posicaoAtual = 'A';
                }
            } else if (movimento == 2) {
                if (posicaoAtual == 'B') {
                    posicaoAtual = 'C';
                } else if (posicaoAtual == 'C') {
                    posicaoAtual = 'B';
                }
            } else if (movimento == 3) {
                if (posicaoAtual == 'A') {
                    posicaoAtual = 'C';
                } else if (posicaoAtual == 'C') {
                    posicaoAtual = 'A';
                }
            }
        }

        System.out.println(posicaoAtual);

        sc.close();
    }
}