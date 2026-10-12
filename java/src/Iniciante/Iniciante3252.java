package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class Iniciante3252 {
    static class Alce implements Comparable<Alce> {
        int forca;
        boolean ehKarl;

        public Alce(int forca, boolean ehKarl) {
            this.forca = forca;
            this.ehKarl = ehKarl;
        }

        @Override
        public int compareTo(Alce outro) {
            return Integer.compare(outro.forca, this.forca);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(tk.nextToken());
        int n = Integer.parseInt(tk.nextToken());

        tk = new StringTokenizer(br.readLine());
        int anoKarl = Integer.parseInt(tk.nextToken());
        int forcaKarl = Integer.parseInt(tk.nextToken());

        int anoInicial = 2011;
        ArrayList<Alce>[] alcesPorAno = new ArrayList[anoInicial + n];

        for (int i = 0; i < alcesPorAno.length; i++) {
            alcesPorAno[i] = new ArrayList<>();
        }

        alcesPorAno[anoKarl].add(new Alce(forcaKarl, true));

        int totalOutros = n + k - 2;

        for (int i = 0; i < totalOutros; i++) {
            tk = new StringTokenizer(br.readLine());
            int ano = Integer.parseInt(tk.nextToken());
            int forca = Integer.parseInt(tk.nextToken());
            alcesPorAno[ano].add(new Alce(forca, false));
        }

        PriorityQueue<Alce> filaPrioridade = new PriorityQueue<>();

        for (Alce alce : alcesPorAno[anoInicial]) {
            filaPrioridade.add(alce);
        }

        for (int ano = anoInicial; ano < anoInicial + n; ano++) {
            if (filaPrioridade.peek().ehKarl) {
                System.out.println(ano);

                return;
            }

            filaPrioridade.poll();

            int proximoAno = ano + 1;

            if (proximoAno < anoInicial + n) {
                for (Alce alce : alcesPorAno[proximoAno]) {
                    filaPrioridade.add(alce);
                }
            }
        }

        System.out.println("unknown");
    }
}