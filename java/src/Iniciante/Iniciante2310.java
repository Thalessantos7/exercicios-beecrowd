package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2310 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        double totalS = 0, totalB = 0, totalA = 0;
        double successS = 0, successB = 0, successA = 0;

        for (int i = 0; i < n; i++) {

            sc.next();

            int S = sc.nextInt();
            int B = sc.nextInt();
            int A = sc.nextInt();

            int S1 = sc.nextInt();
            int B1 = sc.nextInt();
            int A1 = sc.nextInt();

            totalS += S;
            totalB += B;
            totalA += A;

            successS += S1;
            successB += B1;
            successA += A1;

        }

        double percS = (successS / totalS) * 100.0;
        double percB = (successB / totalB) * 100.0;
        double percA = (successA / totalA) * 100.0;

        System.out.printf("Pontos de Saque: %.2f %%.\n", percS);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", percB);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", percA);

        sc.close();

    }

}