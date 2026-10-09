package Iniciante;

import java.util.Scanner;

public class Iniciante3084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;

        while (sc.hasNextInt()) {
            sb = new StringBuilder();

            int horas = sc.nextInt() / 30;
            int minutos = sc.nextInt() / 6;

            if (horas < 10) sb.append('0');
            sb.append(horas).append(':');

            if (minutos < 10) sb.append('0');
            sb.append(minutos).append('\n');

            System.out.print(sb);
        }

        sc.close();
    }
}