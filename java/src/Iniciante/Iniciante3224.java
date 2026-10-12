package Iniciante;

import java.util.Scanner;

public class Iniciante3224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gritoJohn = sc.next();
        String gritoMedico = sc.next();

        if (gritoJohn.length() >= gritoMedico.length()) System.out.println("go");
        else System.out.println("no");

        sc.close();
    }
}