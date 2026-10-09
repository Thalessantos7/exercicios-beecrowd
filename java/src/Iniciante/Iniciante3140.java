package Iniciante;

import java.util.Scanner;

public class Iniciante3140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean dentroDoBody = false;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String conteudo = linha.trim();

            if (conteudo.equals("<body>")) dentroDoBody = true;
            else if (conteudo.equals("</body>")) break;
            else if (dentroDoBody) sb.append(linha).append('\n');
        }

        System.out.print(sb);

        sc.close();
    }
}