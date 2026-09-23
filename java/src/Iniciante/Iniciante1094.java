package Iniciante;

import java.util.Scanner;

public class Iniciante1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), total = 0, totalC = 0, totalR = 0, totalS = 0;

        for (int i = 0; i < n; i++) {
            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);
            total += quantia;

            switch (tipo) {
                case 'C':
                    totalC += quantia;
                    break;
                case 'R':
                    totalR += quantia;
                    break;
                case 'S':
                    totalS += quantia;
                    break;
            }
        }

        double percentualC = totalC * 100.0 / total;
        double percentualR = totalR * 100.0 / total;
        double percentualS = totalS * 100.0 / total;

        System.out.println(
                "Total: " + total + " cobaias\n" +
                "Total de coelhos: " + totalC + "\n" +
                "Total de ratos: " + totalR + "\n" +
                "Total de sapos: " + totalS + "\n" +
                String.format("Percentual de coelhos: %.2f ", percentualC) + "%\n" +
                String.format("Percentual de ratos: %.2f ", percentualR) + "%\n" +
                String.format("Percentual de sapos: %.2f ", percentualS) + "%"
        );
    }
}