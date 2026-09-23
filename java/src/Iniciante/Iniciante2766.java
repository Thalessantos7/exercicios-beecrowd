package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Iniciante2766 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            String nome = sc.next();
            listaNomes.add(nome);

        }

        System.out.println(listaNomes.get(2));
        System.out.println(listaNomes.get(6));
        System.out.println(listaNomes.get(8));

        sc.close();

    }

}