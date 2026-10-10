package Iniciante;

import java.time.LocalDate;
import java.util.Scanner;

public class Iniciante3173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate dataInicial = LocalDate.of(2020, 12, 21);

        double anosJupiter = 11.9;
        double anosSaturno = 29.6;

        double diasPorAno = 365.25;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            int diasJupiter = (int) (n * anosJupiter * diasPorAno);
            int diasSaturno = (int) (n * anosSaturno * diasPorAno);

            LocalDate dataJupiter = dataInicial.plusDays(diasJupiter);
            LocalDate dataSaturno = dataInicial.plusDays(diasSaturno);

            System.out.println("Dias terrestres para Jupiter = " + diasJupiter);
            System.out.println("Data terrestre para Jupiter: " + dataJupiter.toString());
            System.out.println("Dias terrestres para Saturno = " + diasSaturno);
            System.out.println("Data terrestre para Saturno: " + dataSaturno.toString());
        }

        sc.close();
    }
}