package Iniciante;

import java.util.Scanner;

public class Iniciante2769 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int n = sc.nextInt();

            int e1 = sc.nextInt();
            int e2 = sc.nextInt();

            int[] a1 = new int[n];
            int[] a2 = new int[n];

            for (int i = 0; i < n; i++) {

                a1[i] = sc.nextInt();

            }

            for (int i = 0; i < n; i++) {

                a2[i] = sc.nextInt();

            }

            int[] t1 = new int[n - 1];
            int[] t2 = new int[n - 1];

            for (int i = 0; i < n - 1; i++) {

                t1[i] = sc.nextInt();

            }

            for (int i = 0; i < n - 1; i++) {

                t2[i] = sc.nextInt();

            }

            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            int linha1 = e1 + a1[0];
            int linha2 = e2 + a2[0];

            for (int i = 1; i < n; i++) {

                int antigo1 = linha1;
                int antigo2 = linha2;

                linha1 = Math.min(

                        antigo1,
                        antigo2 + t2[i - 1]

                ) + a1[i];

                linha2 = Math.min(

                        antigo2,
                        antigo1 + t1[i - 1]

                ) + a2[i];

            }

            int resposta = Math.min(

                    linha1 + x1,
                    linha2 + x2

            );

            System.out.println(resposta);

        }

        sc.close();

    }

}