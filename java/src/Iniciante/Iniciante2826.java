package Iniciante;

import java.util.Scanner;

public class Iniciante2826 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.compareTo(b) <= 0) {

            System.out.println(a);
            System.out.println(b);

        } else {

            System.out.println(b);
            System.out.println(a);

        }

        sc.close();

    }

}