package Iniciante;

import java.util.Scanner;

public class Iniciante1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a * a < b * b + c * c || b * b < a * a + c * c || c * c < a * a + b * b) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && a == c && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b && b != c || b == c && c != a || c == a && a != b){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}