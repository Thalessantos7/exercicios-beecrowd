package Iniciante;

public class Iniciante1156 {
    public static void main(String[] args) {

        double s = 0.0;
        int numerador, denominador;
        numerador = denominador = 1;

        for (int i = 0; i < 20; i++) {
            s += (double) numerador / denominador;
            numerador += 2;
            denominador *= 2;
        }

        System.out.printf("%.2f%n", s);
    }
}