package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Iniciante3253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();

        int totalRuas = Integer.parseInt(linha.trim());

        int MAX = 1005;
        List<Integer>[] adjacencia = new ArrayList[MAX];

        for (int i = 0; i < MAX; i++) {
            adjacencia[i] = new ArrayList<>();
        }

        int[] idsRuas = new int[totalRuas];

        for (int i = 0; i < totalRuas; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(tk.nextToken());
            idsRuas[i] = id;

            int quantidadeDestinos = Integer.parseInt(tk.nextToken());

            for (int j = 0; j < quantidadeDestinos; j++) {
                adjacencia[id].add(Integer.parseInt(tk.nextToken()));
            }
        }

        boolean[] alcancavelDeZero = new boolean[MAX];
        explorar(0, adjacencia, alcancavelDeZero);

        boolean encontrouProblema = false;

        for (int i = 0; i < totalRuas; i++) {
            int id = idsRuas[i];
            if (id == 0) continue;

            boolean[] visitado = new boolean[MAX];
            explorar(id, adjacencia, visitado);

            if (!visitado[0]) {
                System.out.println("TRAPPED " + id);
                encontrouProblema = true;
            }
        }

        for (int i = 0; i < totalRuas; i++) {
            int id = idsRuas[i];
            if (id == 0) continue;

            if (!alcancavelDeZero[id]) {
                System.out.println("UNREACHABLE " + id);
                encontrouProblema = true;
            }
        }

        if (!encontrouProblema) {
            System.out.println("NO PROBLEMS");
        }
    }

    private static void explorar(int atual, List<Integer>[] adjacencia, boolean[] visitado) {
        visitado[atual] = true;
        for (int vizinho : adjacencia[atual]) {
            if (!visitado[vizinho]) {
                explorar(vizinho, adjacencia, visitado);
            }
        }
    }
}