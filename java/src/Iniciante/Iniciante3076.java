package Iniciante;

import java.util.Scanner;

public class Iniciante3076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int ano = sc.nextInt();
            int seculo = (ano + 99) / 100;

            System.out.println(seculo);
        }

        sc.close();
    }
}