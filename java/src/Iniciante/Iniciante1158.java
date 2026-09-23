package Iniciante;

import java.util.Scanner;

public class Iniciante1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), cont = 0, soma = 0, valor = x;

            if (x % 2 != 0) {
                while (true) {
                    if (cont == y) {
                        break;
                    }
                    if (valor % 2 != 0) {
                        soma += valor;
                        cont++;
                    }

                    valor += 2;
                }
            } else {
                valor = x + 1;

                while (true) {
                    if (cont == y) {
                        break;
                    }
                    if (valor % 2 != 0) {
                        soma += valor;
                        cont++;
                    }

                    valor += 2;
                }
            }

            System.out.println(soma);
        }
    }
}