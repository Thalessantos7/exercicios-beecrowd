package Iniciante;

import java.util.Scanner;
import java.util.Arrays;

public class Iniciante3181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int C = sc.nextInt();

            int[][] encontros = new int[N][N];

            for (int i = 0; i < N; i++) Arrays.fill(encontros[i], 2008);

            for (int i = 0; i < C; i++) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                int ano = sc.nextInt();

                encontros[u][v] = ano;
                encontros[v][u] = ano;
            }

            int anoResposta = -1;

            for (int ano = 1948; ano <= 2009; ano++) {
                if (anoEValido(ano, encontros, N)) {
                    anoResposta = ano;

                    break;
                }
            }

            if (anoResposta == -1) System.out.println("Impossible");
            else System.out.println(anoResposta);
        }

        sc.close();
    }

    static boolean anoEValido(int ano, int[][] encontros, int N) {
        Integer[] participantes = new Integer[N];
        int[] conexoesAntesDoAno = new int[N];

        for (int i = 0; i < N; i++) {
            participantes[i] = i;

            for (int j = 0; j < N; j++) {
                if (i != j && encontros[i][j] < ano) conexoesAntesDoAno[i]++;
            }
        }

        Arrays.sort(participantes, (a, b) -> Integer.compare(conexoesAntesDoAno[b], conexoesAntesDoAno[a]));

        int maxPessoas = (2 * N) / 3;
        int minPessoas = N - maxPessoas;

        if (minPessoas > maxPessoas) return false;

        for (int k = minPessoas; k <= maxPessoas; k++) {
            if (validarGrupos(participantes, k, encontros, ano, N)) return true;
        }

        return false;
    }

    static boolean validarGrupos(Integer[] participantes, int k, int[][] encontros, int ano, int N) {
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                int p1 = participantes[i];
                int p2 = participantes[j];

                if (encontros[p1][p2] >= ano) return false;
            }
        }

        for (int i = k; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int p1 = participantes[i];
                int p2 = participantes[j];

                if (encontros[p1][p2] < ano) return false;
            }
        }

        return true;
    }
}