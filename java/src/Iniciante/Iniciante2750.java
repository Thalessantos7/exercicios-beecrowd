package Iniciante;

public class Iniciante2750 {

    public static void main(String[] args) {

        String linha = "---------------------------------------";

        System.out.println(linha);
        System.out.println("|  decimal  |  octal  |  Hexadecimal  |");
        System.out.println(linha);

        for (int i = 0; i <= 15; i++) {

            System.out.printf("|%7d    |%5o    |%8X       |\n", i, i, i);

        }

        System.out.println(linha);

    }

}