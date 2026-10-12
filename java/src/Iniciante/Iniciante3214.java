package Iniciante;

import java.util.Scanner;

public class Iniciante3214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        int totalGarrafasVazias = e + f;
        int refrigerantesBebidos = 0;

        while (totalGarrafasVazias >= c) {
            int novosRefrigerantes = totalGarrafasVazias / c;

            refrigerantesBebidos += novosRefrigerantes;
            totalGarrafasVazias = (totalGarrafasVazias % c) + novosRefrigerantes;
        }

        System.out.println(refrigerantesBebidos);

        sc.close();
    }
}