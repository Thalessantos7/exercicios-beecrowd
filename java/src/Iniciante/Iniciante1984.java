package Iniciante;

import java.util.Scanner;

public class Iniciante1984 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        String numeroString = Long.toString(num);
        StringBuilder numeroInvertido = new StringBuilder(numeroString).reverse();

        System.out.println(numeroInvertido);

        sc.close();

    }

}