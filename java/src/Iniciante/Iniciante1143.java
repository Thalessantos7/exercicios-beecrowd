package Iniciante;

import java.util.Scanner;

public class Iniciante1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }
    }
}