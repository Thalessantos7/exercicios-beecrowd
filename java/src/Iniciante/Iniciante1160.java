package Iniciante;

import java.util.Scanner;

public class Iniciante1160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int PA = sc.nextInt();
            int PB = sc.nextInt();
            double G1 = sc.nextDouble();
            double G2 = sc.nextDouble();

            int anos = 0;

            while (PA <= PB) {
                PA += (int)(PA * (G1 / 100.0));
                PB += (int)(PB * (G2 / 100.0));
                anos++;

                if (anos > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }

            if (anos <= 100) {
                System.out.println(anos + " anos.");
            }
        }
    }
}