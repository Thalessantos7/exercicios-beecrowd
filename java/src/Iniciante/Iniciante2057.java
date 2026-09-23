package Iniciante;

import java.util.Scanner;

public class Iniciante2057 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(), t = sc.nextInt(), f = sc.nextInt();

        int chegada = (s + t + f) % 24;

        if (chegada < 0) {

            chegada += 24;

        }

        System.out.println(chegada);

        sc.close();

    }

}