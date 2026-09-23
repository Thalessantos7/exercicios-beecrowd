package Iniciante;

import java.util.Scanner;

public class Iniciante1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diasIdade = sc.nextInt();
        int anos = diasIdade / 365;
        int meses = diasIdade % 365 / 30;
        int dias = diasIdade % 365 % 30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);
    }
}