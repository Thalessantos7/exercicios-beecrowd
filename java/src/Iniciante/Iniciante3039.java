package Iniciante;

import java.util.Scanner;

public class Iniciante3039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int carrinhos = 0;
        int bonecas = 0;

        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            String sexo = sc.next();

            if (sexo.equals("M")) carrinhos++;
            else if (sexo.equals("F")) bonecas++;
        }

        System.out.println(carrinhos + " carrinhos");
        System.out.println(bonecas + " bonecas");

        sc.close();
    }
}