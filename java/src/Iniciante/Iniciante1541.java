package Iniciante;

import java.util.Scanner;

public class Iniciante1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }

            int b = sc.nextInt();
            int c = sc.nextInt();

            double areaCasa = a * b;
            double areaTerreno = areaCasa * 100.0 / c;
            int lado = (int) Math.sqrt(areaTerreno);

            System.out.println(lado);
        }
    }
}