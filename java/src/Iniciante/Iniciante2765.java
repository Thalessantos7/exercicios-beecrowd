package Iniciante;

import java.util.Scanner;

public class Iniciante2765 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            String frase = sc.nextLine();

            String[] partes = frase.split(",", 2);

            System.out.println(partes[0]);
            System.out.println(partes[1]);

        }

        sc.close();

    }

}