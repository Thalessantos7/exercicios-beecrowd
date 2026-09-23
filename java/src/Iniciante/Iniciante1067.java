package Iniciante;

import java.util.Scanner;

public class Iniciante1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        for (int i = 1; i < valor + 1; i = i + 2) {
            System.out.println(i);
        }
    }
}