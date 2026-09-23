package Iniciante;

import java.util.Scanner;

public class Iniciante2808 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String origem = sc.next(), destino = sc.next();

        int diffColuna = Math.abs(origem.charAt(0) - destino.charAt(0));
        int diffLinha = Math.abs(origem.charAt(1) - destino.charAt(1));

        if ((diffColuna == 1 && diffLinha == 2) || (diffColuna == 2 && diffLinha == 1)) System.out.println("VALIDO");
        else System.out.println("INVALIDO");

        sc.close();

    }

}