package Iniciante;

import java.util.Scanner;

public class Iniciante1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int maiorValor = valor, pos = 1;


        for (int i = 2; i < 101; i++) {
            valor = sc.nextInt();

            if(valor > maiorValor) {
                maiorValor = valor;
                pos = i;
            }
        }

        System.out.println(maiorValor + "\n" + pos);
    }
}