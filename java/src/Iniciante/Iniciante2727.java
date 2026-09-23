package Iniciante;

import java.util.Scanner;

public class Iniciante2727 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {

                String codigo = sc.nextLine();

                String[] grupos = codigo.split(" ");
                int quantidadeGrupos = grupos.length;
                int quantidadePontos = grupos[0].length();

                int posicao = (quantidadeGrupos - 1) * 3 + quantidadePontos;
                char letra = (char) ('a' + posicao - 1);

                System.out.println(letra);

            }

        }

        sc.close();

    }

}