package Iniciante;

import java.util.Scanner;

public class Iniciante1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;

        System.out.println(maiorAB > c ? maiorAB + " eh o maior" : c + " eh o maior");
    }
}