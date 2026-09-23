package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Iniciante2779 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> figurinhas = new ArrayList<>();

        for (int i = 0; i < M; i++) {

            int X = sc.nextInt();

            if (figurinhas.contains(X)) {

                continue;

            } else {

                figurinhas.add(X);

            }

        }

        System.out.println(N - figurinhas.size());

        sc.close();

    }

}