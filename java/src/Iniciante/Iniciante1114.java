package Iniciante;

import java.util.Scanner;

public class Iniciante1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        while (true) {
            int tentativa = sc.nextInt();

            if (tentativa == senha) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}