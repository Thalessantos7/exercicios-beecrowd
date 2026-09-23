package Iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Iniciante1478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line.trim());

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int valor = Math.abs(i - j) + 1;
                    if (j == 0) {
                        out.printf("%3d", valor);
                    } else {
                        out.printf(" %3d", valor);
                    }
                }
                out.println();
            }
            out.println();
        }

        out.flush();
        out.close();
        br.close();
    }
}