package Iniciante;

import java.util.*;

public class Iniciante2635 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int n = sc.nextInt();

            String[] palavras = new String[n];

            for (int i = 0; i < n; i++) {

                palavras[i] = sc.next();

            }

            int q = sc.nextInt();

            for (int i = 0; i < q; i++) {

                String prefixo = sc.next();

                int quantidade = 0;
                int maior = 0;

                for (String palavra : palavras) {

                    if (palavra.startsWith(prefixo)) {

                        quantidade++;
                        maior = Math.max(maior, palavra.length());

                    }

                }

                if (quantidade == 0) {

                    System.out.println("-1");

                } else {

                    System.out.println(quantidade + " " + maior);

                }

            }

        }

        sc.close();

    }

}