package Iniciante;

import java.util.Scanner;

public class Iniciante1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contPares = 0, contImpares = 0, contPositivos = 0, contNegativos = 0;

        for (int i = 0; i < 5; i++) {
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }

            if (valor > 0) {
                contPositivos++;
            } else if (valor < 0) {
                contNegativos++;
            }
        }

        System.out.println(
                contPares + " valor(es) par(es)\n" +
                contImpares + " valor(es) impar(es)\n" +
                contPositivos + " valor(es) positivo(s)\n" +
                contNegativos + " valor(es) negativo(s)");
    }
}