package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante2762 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        while (sc.hasNextLine()) {

            String numero = sc.nextLine();

            String[] partes = numero.split("\\.");

            int parteDecimal = Integer.parseInt(partes[1]);
            String parteInteira = partes[0];

            System.out.println(parteDecimal + "." + parteInteira);

        }

        sc.close();

    }

}