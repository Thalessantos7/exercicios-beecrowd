package Iniciante;

import java.util.Scanner;

public class Iniciante1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double areaTriangulo = a * c / 2.0;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = (a + b) * c / 2.0;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("""
                TRIANGULO: %.3f
                CIRCULO: %.3f
                TRAPEZIO: %.3f
                QUADRADO: %.3f
                RETANGULO: %.3f
                """, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
    }
}