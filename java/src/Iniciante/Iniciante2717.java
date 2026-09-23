package Iniciante;

import java.util.Scanner;

public class Iniciante2717 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt(), B = sc.nextInt();

        if ((A + B) <= N) {

            System.out.println("Farei hoje!");

        } else {

            System.out.println("Deixa para amanha!");

        }

        sc.close();

    }

}