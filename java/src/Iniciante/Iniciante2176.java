package Iniciante;

import java.util.Scanner;

public class Iniciante2176 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            String s = sc.nextLine().trim();

            if (s.isEmpty()) {

                continue;

            }

            long ones = s.chars().filter(c -> c == '1').count();
            System.out.println(s + (ones % 2 == 0 ? "0" : "1"));

        }

    }

}