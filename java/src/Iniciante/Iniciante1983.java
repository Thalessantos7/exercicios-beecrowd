package Iniciante;

import java.util.Scanner;
import java.util.Locale;

public class Iniciante1983 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int quantidadeDeAlunos = sc.nextInt();
        double maiorPontuacao = 0;
        long matriculaDoMaior = 0;

        for (int i = 0; i < quantidadeDeAlunos; i++) {

            long numeroDaMatricula = sc.nextLong();
            double nota = sc.nextDouble();

            if (nota > maiorPontuacao) {

                maiorPontuacao = nota;
                matriculaDoMaior = numeroDaMatricula;

            }

        }

        if (maiorPontuacao >= 8) {

            System.out.println(matriculaDoMaior);

        } else {

            System.out.println("Minimum note not reached");

        }

        sc.close();

    }

}