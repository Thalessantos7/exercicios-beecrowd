package Iniciante;

import java.util.Scanner;

public class Iniciante2003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String horario = sc.next();

            String[] partes = horario.split(":");
            int hora = Integer.parseInt(partes[0]);
            int minuto = Integer.parseInt(partes[1]);

            int totalMin = hora * 60 + minuto;

            int chegadaMax = totalMin + 60;

            int encontro = 8 * 60;

            int atraso = Math.max(0, chegadaMax - encontro);

            System.out.println("Atraso maximo: " + atraso);

        }

        sc.close();

    }

}