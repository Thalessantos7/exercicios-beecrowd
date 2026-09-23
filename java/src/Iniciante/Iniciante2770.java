package Iniciante;

import java.io.*;
import java.util.*;

public class Iniciante2770 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder saida = new StringBuilder();

        String linha;

        while ((linha = br.readLine()) != null) {

            if (linha.trim().isEmpty()) {

                continue;

            }

            StringTokenizer st = new StringTokenizer(linha);

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for (int i = 0; i < M; i++) {

                st = new StringTokenizer(br.readLine());

                int Xi = Integer.parseInt(st.nextToken());
                int Yi = Integer.parseInt(st.nextToken());

                if ((Xi <= X && Yi <= Y) || (Xi <= Y && Yi <= X)) {

                    saida.append("Sim\n");

                } else {

                    saida.append("Nao\n");

                }

            }

        }

        System.out.print(saida);

    }

}