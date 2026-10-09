package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Iniciante3161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String primeiraLinha = br.readLine();

        String[] nm = primeiraLinha.trim().split("\\s+");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] frutas = new String[n];

        for (int i = 0; i < n; i++) {
            frutas[i] = br.readLine().toLowerCase();
        }

        String[] linhasCorrompidas = new String[m];

        for (int i = 0; i < m; i++) {
            linhasCorrompidas[i] = br.readLine().toLowerCase();
        }

        for (int i = 0; i < n; i++) {
            String fruta = frutas[i];

            String frutaInvertida = new StringBuilder(fruta).reverse().toString();
            boolean encontrada = false;

            for (int j = 0; j < m; j++) {
                if (linhasCorrompidas[j].contains(fruta) || linhasCorrompidas[j].contains(frutaInvertida)) {
                    encontrada = true;
                    break;
                }
            }

            if (encontrada) System.out.println("Sheldon come a fruta " + fruta);
            else System.out.println("Sheldon detesta a fruta " + fruta);
        }
    }
}