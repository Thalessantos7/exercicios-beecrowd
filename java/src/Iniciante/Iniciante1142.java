package Iniciante;

import java.util.Scanner;

public class Iniciante1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(x + " " + (x + 1) + " " + (x + 2) + " PUM");
            x += 4;
        }
    }
}