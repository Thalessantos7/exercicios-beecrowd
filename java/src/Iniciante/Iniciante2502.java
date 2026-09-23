package Iniciante;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Iniciante2502 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int c = sc.nextInt(), n = sc.nextInt();
            sc.nextLine();

            String cifra1 = sc.nextLine();
            String cifra2 = sc.nextLine();

            Map<Character, Character> mapaCifra = new HashMap<>();

            for (int i = 0; i < c; i++) {

                char char1 = cifra1.charAt(i);
                char char2 = cifra2.charAt(i);

                mapaCifra.put(char1, char2);
                mapaCifra.put(char2, char1);

                mapaCifra.put(Character.toLowerCase(char1), Character.toLowerCase(char2));
                mapaCifra.put(Character.toLowerCase(char2), Character.toLowerCase(char1));

            }

            for (int i = 0; i < n; i++) {
                String linhaCripto = sc.nextLine();
                StringBuilder linhaDecifrada = new StringBuilder();

                for (int j = 0; j < linhaCripto.length(); j++) {

                    char atual = linhaCripto.charAt(j);

                    if (mapaCifra.containsKey(atual)) {

                        linhaDecifrada.append(mapaCifra.get(atual));

                    } else {

                        linhaDecifrada.append(atual);

                    }

                }

                System.out.println(linhaDecifrada.toString());

            }

            System.out.println();

        }

        sc.close();

    }

}