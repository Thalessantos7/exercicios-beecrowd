package Iniciante;

import java.util.*;

public class Iniciante2493 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int T = sc.nextInt();

            long[] x = new long[T];
            long[] y = new long[T];
            long[] z = new long[T];

            for (int i = 0; i < T; i++) {

                x[i] = sc.nextLong();

                String expr = sc.next();
                String[] partes = expr.split("=");

                y[i] = Long.parseLong(partes[0]);
                z[i] = Long.parseLong(partes[1]);

            }

            List<String> erraram = new ArrayList<>();

            for (int i = 0; i < T; i++) {

                String nome = sc.next();
                int indice = sc.nextInt() - 1;
                char resp = sc.next().charAt(0);

                boolean soma = (x[indice] + y[indice] == z[indice]);
                boolean sub = (x[indice] - y[indice] == z[indice]);
                boolean mult = (x[indice] * y[indice] == z[indice]);

                boolean correto = false;

                if (resp == '+') {

                    correto = soma;

                } else if (resp == '-') {

                    correto = sub;

                } else if (resp == '*') {

                    correto = mult;

                } else if (resp == 'I') {

                    correto = !(soma || sub || mult);

                }

                if (!correto) {

                    erraram.add(nome);

                }

            }

            if (erraram.size() == 0) {

                System.out.println("You Shall All Pass!");

            } else if (erraram.size() == T) {

                System.out.println("None Shall Pass!");

            } else {

                Collections.sort(erraram);

                for (int i = 0; i < erraram.size(); i++) {

                    if (i > 0) {

                        System.out.print(" ");

                    }

                    System.out.print(erraram.get(i));

                }

                System.out.println();

            }

        }

        sc.close();

    }

}