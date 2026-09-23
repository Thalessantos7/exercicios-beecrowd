package Iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Iniciante1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> vetor = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();
            vetor.add(valor);
        }

        System.out.println(
                "Menor valor: " + Collections.min(vetor) + "\n" +
                "Posicao: " + vetor.indexOf(Collections.min(vetor))
        );
    }
}