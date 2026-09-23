package Iniciante;

import java.util.Scanner;

public class Iniciante1960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] valores = {900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (n >= valores[i]) {
                resultado.append(romanos[i]);
                n -= valores[i];
            }
        }

        System.out.println(resultado.toString());

        sc.close();
    }
}