package Iniciante;

import java.util.Scanner;

public class Iniciante2775 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int n = sc.nextInt();

            int[] pacotes = new int[n];
            int[] tempos = new int[n];

            for (int i = 0; i < n; i++) {

                pacotes[i] = sc.nextInt();

            }

            for (int i = 0; i < n; i++) {

                tempos[i] = sc.nextInt();

            }

            int tempoTotal = 0;

            for (int i = 0; i < n - 1; i++) {

                for (int j = 0; j < n - 1; j++) {

                    if (pacotes[j] > pacotes[j + 1]) {

                        tempoTotal += tempos[j] + tempos[j + 1];

                        int tempP = pacotes[j];
                        pacotes[j] = pacotes[j + 1];
                        pacotes[j + 1] = tempP;

                        int tempT = tempos[j];
                        tempos[j] = tempos[j + 1];
                        tempos[j + 1] = tempT;

                    }

                }

            }

            System.out.println(tempoTotal);

        }

        sc.close();

    }

}