package Iniciante;

import java.util.Scanner;

public class Iniciante1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool, gasolina, diesel;
        alcool = gasolina = diesel = 0;

        while (true) {
            int tipo = sc.nextInt();

            if (tipo == 4) {
                break;
            } else {
                if (tipo == 1) {
                    alcool++;
                } else if (tipo == 2) {
                    gasolina++;
                } else if (tipo == 3) {
                    diesel++;
                }
            }
        }

        System.out.println(
                "MUITO OBRIGADO\n" +
                "Alcool: " + alcool + "\n" +
                "Gasolina: " + gasolina + "\n" +
                "Diesel: " + diesel
        );
    }
}