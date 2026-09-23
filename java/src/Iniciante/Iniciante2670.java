package Iniciante;

import java.util.Scanner;

public class Iniciante2670 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A1 = sc.nextInt(), A2 = sc.nextInt(), A3 = sc.nextInt();
        int andar1 = A2 * 2 + A3 * 4, andar2 = A1 * 2 + A3 * 2, andar3 = A1 * 4 + A2 * 2;
        int resposta = Math.min(andar1, Math.min(andar2, andar3));

        System.out.println(resposta);

        sc.close();

    }

}