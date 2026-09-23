package Iniciante;

import java.util.Scanner;

public class Iniciante1847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (b < a && c >= b) {
            System.out.println(":)");
        } else if (b > a && c <= b) {
            System.out.println(":(");
        } else if (b > a && c > b) {
            if ((c - b) < (b - a)) {
                System.out.println(":(");
            } else {
                System.out.println(":)");
            }
        } else if (b < a && c < b) {
            if ((b - c) < (a - b)) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        } else {
            if (c > b) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }
    }
}