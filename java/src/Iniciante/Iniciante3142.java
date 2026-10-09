package Iniciante;

import java.util.Scanner;

public class Iniciante3142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();;

        while (sc.hasNext()) {
            String coluna = sc.next();
            long indice = 0;

            for (int i = 0; i < coluna.length(); i++) indice = indice * 26 + (coluna.charAt(i) - 'A' + 1);

            if (indice <= 16384) sb.append(indice).append('\n');
            else sb.append("Essa coluna nao existe Tobias!\n");
        }

        System.out.print(sb);

        sc.close();
    }
}