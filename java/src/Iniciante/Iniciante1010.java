package Iniciante;

import java.util.Scanner;

public class Iniciante1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt(), numeroDePecas1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        int codigo2 = sc.nextInt(), numeroDePecas2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", numeroDePecas1 * valor1 + numeroDePecas2 * valor2);
    }
}