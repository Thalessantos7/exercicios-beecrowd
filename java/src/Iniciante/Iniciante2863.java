package Iniciante;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Iniciante2863 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        while (sc.hasNextInt()) {

            int T = sc.nextInt();
            ArrayList<Double> tempos = new ArrayList<>();

            for (int i = 0; i < T; i++) {

                double Ti = sc.nextDouble();

                tempos.add(Ti);

            }

            double menor = tempos.get(0);

            for (double tempo : tempos) {

                if (tempo < menor) menor = tempo;

            }

            System.out.printf("%.2f\n", menor);

        }

        sc.close();

    }

}