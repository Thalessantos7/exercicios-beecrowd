package Iniciante;

public class Iniciante1096 {
    public static void main(String[] args) {
        int i = 1, j = 7;

        while (i <= 9) {
            System.out.println(
                    "I=" + i + " J=" + j + "\n" +
                    "I=" + i + " J=" + (j - 1) + "\n" +
                    "I=" + i + " J=" + (j - 2)
            );

            i += 2;
        }
    }
}