package Iniciante;

import java.util.Scanner;

public class Iniciante2850 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            String situacao = sc.nextLine();

            switch (situacao) {

                case "esquerda" -> System.out.println("ingles");
                case "direita" -> System.out.println("frances");
                case "nenhuma" -> System.out.println("portugues");
                case "as duas" -> System.out.println("caiu");

            }

        }

        sc.close();

    }

}