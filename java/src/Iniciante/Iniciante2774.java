package Iniciante;

import java.util.*;

public class Iniciante2774 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int H = sc.nextInt();
            int M = sc.nextInt();

            int QT = (H * 60) / M;

            double[] x = new double[QT];
            double soma = 0;

            for (int i = 0; i < QT; i++) {

                x[i] = sc.nextDouble();
                soma += x[i];

            }

            double media = soma / QT;
            double somaQuadrados = 0;

            for (int i = 0; i < QT; i++) {

                somaQuadrados += Math.pow(x[i] - media, 2);

            }

            double resultado = Math.sqrt(somaQuadrados / (QT - 1));

            System.out.printf("%.5f%n", resultado);

        }

        sc.close();

    }

}