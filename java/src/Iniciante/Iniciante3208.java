package Iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.math.BigInteger;

public class Iniciante3208 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String kStr = sc.next();
            int L = sc.nextInt();

            if (kStr.equals("0") && L == 0) break;

            BigInteger k = new BigInteger(kStr);
            boolean good = true;
            int menorFator = 0;

            if (L > 2 && k.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                good = false;
                menorFator = 2;
            } else {
                for (int i = 3; i < L; i += 2) {
                    BigInteger divisor = BigInteger.valueOf(i);

                    if (k.mod(divisor).equals(BigInteger.ZERO)) {
                        good = false;
                        menorFator = i;

                        break;
                    }
                }
            }
            
            if (good) System.out.println("GOOD");
            else System.out.println("BAD " + menorFator);
        }

        sc.close();
    }
}