package Iniciante;

import java.util.*;

public class Iniciante2653 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> joias = new HashSet<>();

        while (sc.hasNext()) {

            joias.add(sc.next());

        }

        System.out.println(joias.size());

        sc.close();

    }

}