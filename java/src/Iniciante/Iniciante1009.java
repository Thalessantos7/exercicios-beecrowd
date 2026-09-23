package Iniciante;

import java.util.Scanner;

public class Iniciante1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble(), totalDeVendas = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f%n", (15 * totalDeVendas / 100) + salario);
    }
}