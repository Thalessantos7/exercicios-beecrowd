package Iniciante;

import java.util.Scanner;

public class Iniciante1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt(), horaFinal = sc.nextInt();

        if (horaInicial == 0 && horaFinal == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (horaInicial < horaFinal) {
            int duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            int duracao = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}