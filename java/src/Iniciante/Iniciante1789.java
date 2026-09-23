package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Iniciante1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int l = sc.nextInt(), maior = 0;
            ArrayList<Integer> lesmas = new ArrayList<>();

            for (int i = 0; i < l; i++) {
                int v = sc.nextInt();

                if (v > maior) {
                    maior = v;
                }

                lesmas.add(v);
            }

            if (maior < 10) {
                System.out.println(1);
            } else if (maior >= 10 && maior < 20) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }

            lesmas.clear();
        }
    }
}