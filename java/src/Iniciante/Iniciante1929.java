package Iniciante;

import java.util.Scanner;

public class Iniciante1929 {

    public static boolean formaTriangulo(int x, int y, int z) {
        return x + y > z && x + z > y && y + z > x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (formaTriangulo(a, b, c) ||
                formaTriangulo(a, b, d) ||
                formaTriangulo(a, c, d) ||
                formaTriangulo(b, c, d)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}