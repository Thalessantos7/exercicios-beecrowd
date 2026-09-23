package Iniciante;

import java.util.Scanner;

public class Iniciante1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        double totalCombustivel = sc.nextDouble();
        double consumo = distancia / totalCombustivel;

        System.out.printf("%.3f km/l%n", consumo);
    }
}