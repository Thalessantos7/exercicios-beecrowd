package Iniciante;

import java.util.Scanner;

public class Iniciante1848 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, resultados = 0;

        while (resultados < 3) {
            String linha = sc.nextLine();

            if (linha.equals("caw caw")) {
                System.out.println(soma);
                soma = 0;
                resultados++;
            } else {
                int valor = 0;

                for (int i = 0; i < 3; i++) {
                    if (linha.charAt(i) == '*') {
                        valor += (1 << (2 - i));
                    }
                }

                soma += valor;
            }
        }
    }
}