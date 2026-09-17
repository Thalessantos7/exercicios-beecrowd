package Iniciante;

import java.util.Scanner;

public class Iniciante2936 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int curupiraP = sc.nextInt();
        int boitataP = sc.nextInt();
        int botoP = sc.nextInt();
        int mapinguariP = sc.nextInt();
        int iaraP = sc.nextInt();

        System.out.println((curupiraP * 300) + (boitataP * 1500) + (botoP * 600) + (mapinguariP * 1000) + (iaraP * 150) + 225);

        sc.close();

    }

}