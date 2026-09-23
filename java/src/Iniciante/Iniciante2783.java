package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Iniciante2783 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), C = sc.nextInt(), M = sc.nextInt();
        ArrayList<Integer> carimbadas = new ArrayList<>();

        for (int i = 0; i < C; i++) {

            int Xi = sc.nextInt();

            carimbadas.add(Xi);

        }

        for (int i = 0; i < M; i++) {

            int Yi = sc.nextInt();

            if (carimbadas.contains(Yi) == true) {

                carimbadas.remove(carimbadas.indexOf(Yi));

            }

        }

        System.out.println(carimbadas.size());

        sc.close();

    }

}