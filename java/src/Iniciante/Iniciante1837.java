package Iniciante;

import java.util.Scanner;

public class Iniciante1837 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int q = a / b;
        int r = a % b;

        if (r < 0) {
            r += Math.abs(b);

            if (b > 0) {
                q--;
            } else {
                q++;
            }
        }

        System.out.println(q + " " + r);
    }
}