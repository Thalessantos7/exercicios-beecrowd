package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Iniciante1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> par = new ArrayList<>(), impar = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                par.add(valor);
            } else {
                impar.add(valor);
            }

            if (par.size() == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("par[" + j + "] = " + par.get(j));
                }

                par.clear();
            } else if (impar.size() == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("impar[" + j + "] = " + impar.get(j));
                }

                impar.clear();
            }
        }

        for (int i = 0; i < impar.size(); i++) {
            System.out.println("impar[" + i + "] = " + impar.get(i));
        }

        for (int i = 0; i < par.size(); i++) {
            System.out.println("par[" + i + "] = " + par.get(i));
        }
    }
}