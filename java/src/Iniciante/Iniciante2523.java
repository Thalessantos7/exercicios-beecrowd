package Iniciante;

import java.util.Scanner;

public class Iniciante2523 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String letras = sc.next();
            int n = sc.nextInt();

            StringBuilder mensagem = new StringBuilder();

            for (int i = 0; i < n; i++) {

                int lampada = sc.nextInt();
                mensagem.append(letras.charAt(lampada - 1));

            }

            System.out.println(mensagem);

        }

        sc.close();

    }

}