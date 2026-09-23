package Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iniciante2724 {

    static class Componente {

        String elemento;
        int quantidade;

        public Componente(String elemento, int quantidade) {

            this.elemento = elemento;
            this.quantidade = quantidade;

        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {

                return true;

            }

            if (obj == null || getClass() != obj.getClass()) {

                return false;

            }

            Componente other = (Componente) obj;

            return quantidade == other.quantidade && elemento.equals(other.elemento);

        }

    }

    private static List<Componente> parseFormula(String formula) {

        List<Componente> componentes = new ArrayList<>();
        int i = 0;
        int n = formula.length();

        while (i < n) {

            StringBuilder elemStr = new StringBuilder();

            if (Character.isUpperCase(formula.charAt(i))) {

                elemStr.append(formula.charAt(i));
                i++;

                if (i < n && Character.isLowerCase(formula.charAt(i))) {

                    elemStr.append(formula.charAt(i));
                    i++;

                }

            } else {

                i++;

                continue;

            }

            StringBuilder qtdStr = new StringBuilder();

            while (i < n && Character.isDigit(formula.charAt(i))) {

                qtdStr.append(formula.charAt(i));
                i++;

            }

            int quantidade = qtdStr.length() > 0 ? Integer.parseInt(qtdStr.toString()) : 1;
            componentes.add(new Componente(elemStr.toString(), quantidade));

        }

        return componentes;
    }

    private static boolean contemSubsequencia(List<Componente> experimento, List<Componente> perigo) {

        int tamExp = experimento.size();
        int tamPerigo = perigo.size();

        if (tamPerigo > tamExp) {

            return false;

        }

        for (int i = 0; i <= tamExp - tamPerigo; i++) {

            boolean match = true;

            for (int j = 0; j < tamPerigo; j++) {

                if (!experimento.get(i + j).equals(perigo.get(j))) {

                    match = false;

                    break;

                }

            }

            if (match) {

                return true;

            }

        }

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {

            return;

        }

        int N = sc.nextInt();

        for (int caso = 0; caso < N; caso++) {

            int T = sc.nextInt();
            List<List<Componente>> compostosPerigosos = new ArrayList<>();

            for (int i = 0; i < T; i++) {

                String formula = sc.next();
                compostosPerigosos.add(parseFormula(formula));

            }

            int U = sc.nextInt();

            for (int i = 0; i < U; i++) {

                String expStr = sc.next();
                List<Componente> experimento = parseFormula(expStr);

                boolean ePerigoso = false;

                for (List<Componente> perigoso : compostosPerigosos) {

                    if (contemSubsequencia(experimento, perigoso)) {

                        ePerigoso = true;

                        break;

                    }

                }

                if (ePerigoso) {

                    System.out.println("Abortar");

                } else {

                    System.out.println("Prossiga");

                }

            }

            if (caso < N - 1) {

                System.out.println();

            }

        }

        sc.close();

    }

}