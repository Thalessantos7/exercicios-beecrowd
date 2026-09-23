package Iniciante;

import java.util.Scanner;

public class Iniciante1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt(), cont = 0;

        while (true) {
            if (cont == 6) {
                break;
            }

            if (valor % 2 != 0) {
                System.out.println(valor);
                cont++;
                valor++;
            } else {
                valor++;
            }
        }
    }
}