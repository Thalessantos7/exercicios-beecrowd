package Iniciante;

import java.util.Scanner;

public class Iniciante2721 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] renas = {

                "Dasher",
                "Dancer",
                "Prancer",
                "Vixen",
                "Comet",
                "Cupid",
                "Donner",
                "Blitzen",
                "Rudolph"

        };

        int soma = 0;

        for (int i = 0; i < 9; i++) {

            soma += sc.nextInt();

        }

        int vencedor = (soma - 1) % 9;
        System.out.println(renas[vencedor]);

        sc.close();

    }

}