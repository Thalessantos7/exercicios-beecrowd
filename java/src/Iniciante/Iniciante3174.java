package Iniciante;

import java.util.Scanner;

public class Iniciante3174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int horasBonecos = 0;
        int horasArquitetos = 0;
        int horasMusicos = 0;
        int horasDesenhistas = 0;

        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            String grupo = sc.next();
            int horas = sc.nextInt();

            switch (grupo) {
                case "bonecos" -> horasBonecos += horas;
                case "arquitetos" -> horasArquitetos += horas;
                case "musicos" -> horasMusicos += horas;
                case "desenhistas" -> horasDesenhistas += horas;
            }
        }

        int totalPresentes = (horasBonecos / 8) +
                (horasArquitetos / 4) +
                (horasMusicos / 6) +
                (horasDesenhistas / 12);

        System.out.println(totalPresentes);

        sc.close();
    }
}