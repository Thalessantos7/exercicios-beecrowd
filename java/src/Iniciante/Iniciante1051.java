package Iniciante;

import java.util.Scanner;

public class Iniciante1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble(), imposto = 0;

        if (salario <= 2000.0) {
            System.out.println("Isento");
        } else {
            double restante = salario;

            if (restante > 2000.0) {
                double faixa = Math.min(restante - 2000.0, 1000.0);
                imposto += faixa * 0.08;
            }

            if (restante > 3000.0) {
                double faixa = Math.min(restante - 3000.0, 1500.0);
                imposto += faixa * 0.18;
            }

            if (restante > 4500.0) {
                double faixa = restante - 4500.0;
                imposto += faixa * 0.28;
            }

            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}