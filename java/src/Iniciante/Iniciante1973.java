package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Iniciante1973 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] a = new long[n];
        boolean[] visited = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        long total = 0;

        for (int i = 0; i < n; i++) {

            a[i] = Long.parseLong(st.nextToken());
            total += a[i];

        }

        int i = 0;
        long roubados = 0;
        int atacadas = 0;

        while (i >= 0 && i < n) {

            if (!visited[i]) {

                visited[i] = true;
                atacadas++;

            }

            long atual = a[i];

            if (a[i] > 0) {

                a[i]--;
                roubados++;

            }

            if (atual % 2 == 1) {

                i++;

            } else {

                i--;

            }

        }

        System.out.println(atacadas + " " + (total - roubados));
    }
}