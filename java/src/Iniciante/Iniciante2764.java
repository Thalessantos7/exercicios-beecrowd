package Iniciante;

import java.util.Scanner;

public class Iniciante2764 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            String[] data = sc.nextLine().split("/");

            String dia = data[0];
            String mes = data[1];
            String ano = data[2];

            System.out.println(mes + "/" + dia + "/" + ano);
            System.out.println(ano + "/" + mes + "/" + dia);
            System.out.println(dia + "-" + mes + "-" + ano);

        }

        sc.close();

    }

}