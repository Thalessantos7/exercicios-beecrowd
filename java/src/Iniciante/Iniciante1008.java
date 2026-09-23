package Iniciante;

import java.util.Scanner;

public class Iniciante1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), horas = sc.nextInt();
        double valor = sc.nextDouble();

        System.out.printf("""
                NUMBER = %d
                SALARY = U$ %.2f
                """, num, horas * valor);
    }
}