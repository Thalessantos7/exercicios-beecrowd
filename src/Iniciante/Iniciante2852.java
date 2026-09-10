package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Iniciante2852 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String chave = br.readLine().trim();
        int n = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String[] palavras = br.readLine().split(" ");
            int indiceChave = 0;

            for (int w = 0; w < palavras.length; w++) {

                String palavra = palavras[w];
                char primeiraLetra = palavra.charAt(0);

                if (primeiraLetra != 'a' && primeiraLetra != 'e' && primeiraLetra != 'i' && primeiraLetra != 'o' && primeiraLetra != 'u') {

                    for (int j = 0; j < palavra.length(); j++) {

                        char p = palavra.charAt(j);
                        char k = chave.charAt(indiceChave % chave.length());
                        indiceChave++;

                        char criptografado = (char) ('a' + (p - 'a' + k - 'a') % 26);
                        sb.append(criptografado);

                    }

                } else {

                    sb.append(palavra);

                }

                if (w < palavras.length - 1) sb.append(" ");

            }

            sb.append("\n");

        }

        System.out.print(sb);

        br.close();

    }

}