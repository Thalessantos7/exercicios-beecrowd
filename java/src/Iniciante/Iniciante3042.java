package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Iniciante3042 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();

            if (linha.isEmpty()) continue;

            int m = Integer.parseInt(linha);

            if (m == 0) break;

            int posAtual = 1;
            int toques = 0;

            for (int i = 0; i < m; i++) {
                String[] partes = br.readLine().trim().split("\\s+");
                int l = Integer.parseInt(partes[0]);
                int c = Integer.parseInt(partes[1]);
                int r = Integer.parseInt(partes[2]);

                int[] pistas = {l, c, r};

                if (pistas[posAtual] == 1) {
                    int novaPos = -1;

                    if (l == 0) novaPos = 0;
                    else if (c == 0) novaPos = 1;
                    else if (r == 0) novaPos = 2;

                    toques += Math.abs(novaPos - posAtual);
                    posAtual = novaPos;
                }
            }

            System.out.println(toques);

            br.close();
        }
    }
}