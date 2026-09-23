package Iniciante;

import java.util.Scanner;

public class Iniciante1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.next();
        int d1 = sc.nextInt(), h1 = sc.nextInt();
        sc.next();
        int m1 = sc.nextInt();
        sc.next();
        int s1 = sc.nextInt();

        sc.next();
        int d2 = sc.nextInt(), h2 = sc.nextInt();
        sc.next();
        int m2 = sc.nextInt();
        sc.next();
        int s2 = sc.nextInt();

        int inicio = s1 + m1*60 + h1*3600 + d1*86400;
        int fim = s2 + m2*60 + h2*3600 + d2*86400;
        int tempo = fim - inicio;

        System.out.println(tempo / 86400 + " dia(s)");
        tempo %= 86400;
        System.out.println(tempo / 3600 + " hora(s)");
        tempo %= 3600;
        System.out.println(tempo / 60 + " minuto(s)");
        System.out.println(tempo % 60 + " segundo(s)");
    }
}