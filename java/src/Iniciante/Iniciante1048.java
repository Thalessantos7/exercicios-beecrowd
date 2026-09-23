package Iniciante;

import java.util.Scanner;

public class Iniciante1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble(), novoSalario, reajuste;
        String percentual;

        if (salario > 0 && salario <= 400.00) {
            reajuste = salario * 15 / 100;
            novoSalario = salario + reajuste;
            percentual = "15 %";
        } else if (salario > 400.00 && salario <= 800.00) {
            reajuste = salario * 12 / 100;
            novoSalario = salario + reajuste;
            percentual = "12 %";
        } else if (salario > 800.00 && salario <= 1200.00) {
            reajuste = salario * 10 / 100;
            novoSalario = salario + reajuste;
            percentual = "10 %";
        } else if (salario > 1200.00 && salario <= 2000.00) {
            reajuste = salario * 7 / 100;
            novoSalario = salario + reajuste;
            percentual = "7 %";
        } else {
            reajuste = salario * 4 / 100;
            novoSalario = salario + reajuste;
            percentual = "4 %";
        }

        System.out.printf(
                "Novo salario: %.2f" +
                "%nReajuste ganho: %.2f" +
                "%nEm percentual: %s%n", novoSalario, reajuste, percentual);
    }
}