package Iniciante;

import java.util.Scanner;

public class Iniciante2930 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt(), D = sc.nextInt();

        if (E > D) System.out.println("Eu odeio a professora!");
        else if ((D - E) >= 3) System.out.println("Muito bem! Apresenta antes do Natal!");
        else if ((E + 2) < 24) System.out.println("Parece o trabalho do meu filho!\nTCC Apresentado!");
        else System.out.println("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!");

        sc.close();

    }

}