package Iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Iniciante2812 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int m = sc.nextInt();

            List<Integer> impares = new ArrayList<>();

            for (int j = 0; j < m; j++) {

                int valor = sc.nextInt();

                if (valor % 2 != 0) impares.add(valor);

            }

            Collections.sort(impares);

            List<Integer> resultado = new ArrayList<>();
            int inicio = 0, fim = impares.size() - 1;

            while (inicio <= fim) {

                if (inicio == fim) {

                    resultado.add(impares.get(fim));

                } else {

                    resultado.add(impares.get(fim));
                    resultado.add(impares.get(inicio));

                }

                fim--;
                inicio++;

            }

            for (int k = 0; k < resultado.size(); k++) {

                if (k > 0) System.out.print(" ");

                System.out.print(resultado.get(k));

            }

            System.out.println();

        }

        sc.close();

    }

}