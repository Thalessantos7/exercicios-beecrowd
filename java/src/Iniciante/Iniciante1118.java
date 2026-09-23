package Iniciante;

import java.util.Scanner;

public class Iniciante1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int cont = 0;

        while (true) {
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                cont++;
            } else {
                System.out.println("nota invalida");
            }

            if (cont == 2) {
                double media = soma / 2;
                System.out.printf("media = %.2f%n", media);

                int novoCalculo;
                do {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    novoCalculo = sc.nextInt();
                } while (novoCalculo != 1 && novoCalculo != 2);

                if (novoCalculo == 2) break;
                soma = 0;
                cont = 0;
            }
        }
    }
}