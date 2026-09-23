package Iniciante;

import java.util.Scanner;

public class Iniciante2763 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cpf = sc.nextLine();

        String[] partes = cpf.split("[.-]");

        for (String parte : partes) {

            System.out.println(parte);

        }

        sc.close();

    }

}