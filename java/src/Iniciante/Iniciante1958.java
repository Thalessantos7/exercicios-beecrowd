package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Iniciante1958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double x = sc.nextDouble();

        String s = String.format(Locale.US, "%+.4E", x);

        int i = s.indexOf('E');
        String mantissa = s.substring(0, i);
        String exp = s.substring(i + 1);

        char sign = exp.charAt(0);
        int value = Integer.parseInt(exp.substring(1));

        String expFormatado = String.format("%c%02d", sign, value);

        System.out.println(mantissa + "E" + expFormatado);
    }
}