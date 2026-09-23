package Iniciante;

import java.util.Scanner;

public class Iniciante1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt(), quantidade = sc.nextInt();
        Double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};
        double total = precos[codigo - 1] * quantidade;

        System.out.printf("Total: R$ %.2f%n", total);
    }
}