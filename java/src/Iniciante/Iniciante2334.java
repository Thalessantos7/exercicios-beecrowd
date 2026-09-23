package Iniciante;

import java.io.*;
import java.math.BigInteger;

public class Iniciante2334 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {

            line = line.trim();
            if (line.isEmpty()) {

                continue;

            }

            if (line.equals("-1")) {

                break;

            }

            BigInteger p = new BigInteger(line);

            if (p.compareTo(BigInteger.ZERO) <= 0) {

                sb.append(0).append('\n');

            } else {

                sb.append(p.subtract(BigInteger.ONE)).append('\n');

            }

        }

        System.out.print(sb);

    }

}