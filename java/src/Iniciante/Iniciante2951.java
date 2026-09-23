package Iniciante;

import java.util.HashMap;
import java.util.Scanner;

public class Iniciante2951 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), g = sc.nextInt();

        HashMap<String, Integer> runas = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String runa = sc.next();
            int valor = sc.nextInt();
            runas.put(runa, valor);

        }

        int x = sc.nextInt();
        int totalAmizade = 0;

        for (int i = 0; i < x; i++) {

            String runaRecitada = sc.next();

            if (runas.containsKey(runaRecitada)) totalAmizade += runas.get(runaRecitada);

        }

        System.out.println(totalAmizade);

        if (totalAmizade >= g) System.out.println("You shall pass!");
        else System.out.println("My precioooous");

        sc.close();

    }

}