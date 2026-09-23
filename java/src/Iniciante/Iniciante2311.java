package Iniciante;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Iniciante2311 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String nome = sc.nextLine();

            double grau = sc.nextDouble();

            double[] notas = new double[7];
            double soma = 0;

            for (int j = 0; j < 7; j++) {

                notas[j] = sc.nextDouble();
                soma += notas[j];

            }

            Arrays.sort(notas);

            soma -= notas[0];
            soma -= notas[6];

            double resultado = soma * grau;

            System.out.printf("%s %.2f%n", nome, resultado);

            if (sc.hasNextLine()) {

                sc.nextLine();

            }

        }

        sc.close();

    }

}