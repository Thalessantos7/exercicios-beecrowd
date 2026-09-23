package Iniciante;

import java.util.Scanner;

public class Iniciante2486 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int T = sc.nextInt();

            if (T == 0) {

                break;

            }

            int soma = 0;

            for (int i = 0; i < T; i++) {

                int N = sc.nextInt();
                String alimento = sc.nextLine().trim();

                if (alimento.equals("suco de laranja")) {

                    soma += N * 120;

                } else if (alimento.equals("morango fresco") || alimento.equals("mamao")) {

                    soma += N * 85;

                } else if (alimento.equals("goiaba vermelha")) {

                    soma += N * 70;

                } else if (alimento.equals("manga")) {

                    soma += N * 56;

                } else if (alimento.equals("laranja")) {

                    soma += N * 50;

                } else {

                    soma += N * 34;

                }

            }

            if (soma < 110) {

                System.out.println("Mais " + (110 - soma) + " mg");

            } else if (soma > 130) {

                System.out.println("Menos " + (soma - 130) + " mg");

            } else {

                System.out.println(soma + " mg");

            }

        }

        sc.close();

    }

}