package Iniciante;

import java.util.Scanner;

public class Iniciante1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vitoriasInter, vitoriasGremio, empates, total;
        vitoriasInter = vitoriasGremio = empates = total = 0;

        while (true) {
            int inter = sc.nextInt(), gremio = sc.nextInt();
            total++;

            if (inter == gremio) {
                empates++;
            } else if (inter > gremio) {
                vitoriasInter++;
            } else {
                vitoriasGremio++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            int novoGrenal = sc.nextInt();

            if (novoGrenal == 2) {
                break;
            }
        }

        String vencedor = (vitoriasInter > vitoriasGremio) ? "Inter venceu mais" :
                (vitoriasGremio > vitoriasInter) ? "Gremio venceu mais" :
                "Nao houve vencedor";

        System.out.println(
                total + " grenais\n" +
                "Inter:" + vitoriasInter + "\n" +
                "Gremio:" + vitoriasGremio + "\n" +
                "Empates:" + empates + "\n" + vencedor);
    }
}