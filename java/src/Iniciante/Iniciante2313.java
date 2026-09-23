package Iniciante;

import java.util.Scanner;
import java.util.Arrays;

public class Iniciante2313 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if (A + B <= C || A + C <= B || B + C <= A) {

            System.out.println("Invalido");

        } else {

            if (A == B && B == C) {

                System.out.println("Valido-Equilatero");

            } else if (A == B || A == C || B == C) {

                System.out.println("Valido-Isoceles");

            } else {

                System.out.println("Valido-Escaleno");

            }

            int[] lados = {A, B, C};
            Arrays.sort(lados);

            if (lados[0] * lados[0] + lados[1] * lados[1] == lados[2] * lados[2]) {

                System.out.println("Retangulo: S");

            } else {

                System.out.println("Retangulo: N");

            }

        }

        sc.close();

    }

}