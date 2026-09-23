package Iniciante;

import java.util.Scanner;

public class Iniciante2760 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();

        System.out.println(A + B + C);
        System.out.println(B + C + A);
        System.out.println(C + A + B);
        System.out.println(A.substring(0, Math.min(10, A.length())) + B.substring(0, Math.min(10, B.length())) + C.substring(0, Math.min(10, C.length())));

        sc.close();

    }

}