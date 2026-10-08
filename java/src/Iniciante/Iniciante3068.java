package Iniciante;

import java.util.Scanner;

public class Iniciante3068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teste = 1;

        while (sc.hasNextInt()) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break;

            int n = sc.nextInt();
            int meteoritosNaFazenda = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x >= x1 && x <= x2 && y >= y2 && y <= y1) meteoritosNaFazenda++;
            }

            System.out.println("Teste " + teste);
            System.out.println(meteoritosNaFazenda);

            teste++;
        }

        sc.close();
    }
}