package Iniciante;

import java.util.Scanner;

public class Iniciante2949 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int contAnoes, contElfos, contHumanos, contMagos, contHobbits;
        contAnoes = contElfos = contHumanos = contMagos = contHobbits = 0;

        for (int i = 0; i < N; i++) {

            String nome = sc.next();
            char tipoRaca = sc.next().charAt(0);

            switch (tipoRaca) {

                case 'A' -> contAnoes++;
                case 'E' -> contElfos++;
                case 'H' -> contHumanos++;
                case 'M' -> contMagos++;
                case 'X' -> contHobbits++;

            }

        }

        System.out.println(contHobbits + " Hobbit(s)");
        System.out.println(contHumanos + " Humano(s)");
        System.out.println(contElfos + " Elfo(s)");
        System.out.println(contAnoes + " Anao(oes)");
        System.out.println(contMagos + " Mago(s)");

        sc.close();

    }

}