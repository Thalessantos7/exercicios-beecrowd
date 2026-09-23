package Iniciante;

import java.util.Scanner;

public class Iniciante2626 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String dodo = sc.next(), leo = sc.next(), pepper = sc.next();

            if (leo.equals(pepper) && !dodo.equals(leo)) {

                if ((dodo.equals("pedra") && leo.equals("tesoura")) || (dodo.equals("tesoura") && leo.equals("papel")) || (dodo.equals("papel") && leo.equals("pedra"))) {

                    System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");

                } else {

                    System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");

                }

            } else if (dodo.equals(pepper) && !leo.equals(dodo)) {

                if ((leo.equals("pedra") && dodo.equals("tesoura")) || (leo.equals("tesoura") && dodo.equals("papel")) || (leo.equals("papel") && dodo.equals("pedra"))) {

                    System.out.println("Iron Maiden's gonna get you, no matter how far!");

                } else {

                    System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");

                }
            } else if (dodo.equals(leo) && !pepper.equals(dodo)) {

                if ((pepper.equals("pedra") && dodo.equals("tesoura")) || (pepper.equals("tesoura") && dodo.equals("papel")) || (pepper.equals("papel") && dodo.equals("pedra"))) {

                    System.out.println("Urano perdeu algo muito precioso...");

                } else {

                    System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");

                }

            } else {

                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");

            }

        }

        sc.close();

    }

}