package Iniciante;

import java.util.Scanner;

public class Iniciante2165 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();

        if (t.length() <= 140) {

            System.out.println("TWEET");

        } else {

            System.out.println("MUTE");

        }

        sc.close();

    }

}