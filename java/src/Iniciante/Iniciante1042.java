package Iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Iniciante1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt(), valor2 = sc.nextInt(), valor3 = sc.nextInt();
        int[] valores = {valor1, valor2, valor3};
        int[] valoresCrescente = {valor1, valor2, valor3};
        Arrays.sort(valoresCrescente);

        for (int valor : valoresCrescente) {
            System.out.println(valor);
        }

        System.out.println();

        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}