package Iniciante;

import java.util.Scanner;

public class Iniciante1828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            String sheldon = sc.next(), raj = sc.next();

            System.out.printf("Caso #%d: ", i);

            if (sheldon.equals("papel")) {
                if (raj.equals("papel")) {
                    System.out.println("De novo!");
                } else if (raj.equals("pedra")) {
                    System.out.println("Bazinga!");
                } else if (raj.equals("tesoura")) {
                    System.out.println("Raj trapaceou!");
                } else if (raj.equals("lagarto")) {
                    System.out.println("Raj trapaceou!");
                } else {
                    System.out.println("Bazinga!");
                }
            } else if (sheldon.equals("pedra")) {
                if (raj.equals("pedra")) {
                    System.out.println("De novo!");
                } else if (raj.equals("papel")) {
                    System.out.println("Raj trapaceou!");
                } else if (raj.equals("tesoura")) {
                    System.out.println("Bazinga!");
                } else if (raj.equals("lagarto")) {
                    System.out.println("Bazinga!");
                } else {
                    System.out.println("Raj trapaceou!");
                }
            } else if (sheldon.equals("tesoura")) {
                if (raj.equals("tesoura")) {
                    System.out.println("De novo!");
                } else if (raj.equals("pedra")) {
                    System.out.println("Raj trapaceou!");
                } else if (raj.equals("papel")) {
                    System.out.println("Bazinga!");
                } else if (raj.equals("lagarto")) {
                    System.out.println("Bazinga!");
                } else {
                    System.out.println("Raj trapaceou!");
                }
            } else if (sheldon.equals("lagarto")) {
                if (raj.equals("lagarto")) {
                    System.out.println("De novo!");
                } else if (raj.equals("pedra")) {
                    System.out.println("Raj trapaceou!");
                } else if (raj.equals("papel")) {
                    System.out.println("Bazinga!");
                } else if (raj.equals("tesoura")) {
                    System.out.println("Raj trapaceou!");
                } else {
                    System.out.println("Bazinga!");
                }
            } else {
                if (raj.equals("Spock")) {
                    System.out.println("De novo!");
                } else if (raj.equals("pedra")) {
                    System.out.println("Bazinga!");
                } else if (raj.equals("papel")) {
                    System.out.println("Raj trapaceou!");
                } else if (raj.equals("tesoura")) {
                    System.out.println("Bazinga!");
                } else {
                    System.out.println("Raj trapaceou!");
                }
            }
        }
    }
}