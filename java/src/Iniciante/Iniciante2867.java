package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Iniciante2867 {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            String linha = br.readLine();
            int c = Integer.parseInt(linha.trim());

            for (int i = 0; i < c; i++) {

                StringTokenizer st = new StringTokenizer(br.readLine());

                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                BigInteger base = BigInteger.valueOf(n);
                BigInteger result = base.pow(m);

                System.out.println(result.toString().length());

            }

        } catch (IOException e) {

            System.out.println("Erro: " + e);

        }

    }

}