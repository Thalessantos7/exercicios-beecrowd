package Iniciante;

import java.util.Scanner;

public class Iniciante3065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teste = 1;

        while (sc.hasNextInt()) {
            int m = sc.nextInt();

            if (m == 0) break;

            String expr = sc.next();

            int resultado = 0;
            int numeroAtual = 0;
            char operador = '+';

            for (int i = 0; i < expr.length(); i++) {
                char c = expr.charAt(i);

                if (Character.isDigit(c)) numeroAtual = numeroAtual * 10 + (c - '0');
                else {
                    if (operador == '+') resultado += numeroAtual;
                    else if (operador == '-') resultado -= numeroAtual;

                    numeroAtual = 0;
                    operador = c;
                }
            }

            if (operador == '+') resultado += numeroAtual;
            else if (operador == '-') resultado -= numeroAtual;

            System.out.println("Teste " + teste);
            System.out.println(resultado);
            System.out.println();

            teste++;
        }

        sc.close();
    }
}