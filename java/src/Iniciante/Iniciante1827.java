package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iniciante1827 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;
        StringBuilder saida = new StringBuilder();

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();
            if (linha.isEmpty()) continue;

            int n = Integer.parseInt(linha);

            int inicio = n / 3;
            int fim = n - inicio - 1;
            int centro = n / 2;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int valor = 0;

                    if (i == j) valor = 2;
                    if (i + j == n - 1) valor = 3;
                    if (i >= inicio && i <= fim && j >= inicio && j <= fim) valor = 1;
                    if (i == centro && j == centro) valor = 4;

                    saida.append(valor);
                }

                saida.append('\n');
            }

            saida.append('\n');
        }

        System.out.print(saida.toString());
    }
}