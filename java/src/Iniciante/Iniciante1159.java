package Iniciante;

import java.util.Scanner;

public class Iniciante1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt(), cont = 0, soma = 0;

            if (x == 0) {
                break;
            }

            if (x % 2 == 0) {
                while (true) {
                    if (cont == 5) {
                        break;
                    }

                    soma += x;
                    cont++;
                    x += 2;
                }
            } else {
                x += 1;

                while (true) {
                    if (cont == 5) {
                        break;
                    }

                    soma += x;
                    cont++;
                    x += 2;
                }
            }

            System.out.println(soma);
        }
    }
}