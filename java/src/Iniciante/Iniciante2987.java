package Iniciante;

import java.util.Scanner;

public class Iniciante2987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra = sc.next().charAt(0);
        char[] letrasAlfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < letrasAlfabeto.length; i++) {
            if (letra == letrasAlfabeto[i]) {
                System.out.println(i + 1);

                break;
            }
        }

        sc.close();
    }
}