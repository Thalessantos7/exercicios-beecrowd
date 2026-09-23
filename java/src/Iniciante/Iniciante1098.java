package Iniciante;

public class Iniciante1098 {
    public static void main(String[] args) {

        for (int k = 0; k <= 10; k++) {
            double i = k * 0.2;

            for (int j = 1; j <= 3; j++) {
                double valorJ = i + j;

                if (i == (int) i) {
                    System.out.println("I=" + (int) i + " J=" + (int) valorJ);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, valorJ);
                }
            }
        }
    }
}