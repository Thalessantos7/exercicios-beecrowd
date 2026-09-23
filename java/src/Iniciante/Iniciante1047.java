package Iniciante;

import java.util.Scanner;

public class Iniciante1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt(), minutoInicial = sc.nextInt(), horaFinal = sc.nextInt(), minutoFinal = sc.nextInt();
        int duracao;
        int inicio = (horaInicial * 60) + minutoInicial;
        int fim = (horaFinal * 60) + minutoFinal;

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 * 60 - inicio) + fim;
        }

        int horas = duracao / 60, minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}