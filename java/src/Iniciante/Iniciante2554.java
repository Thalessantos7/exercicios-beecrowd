package Iniciante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Iniciante2554 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {

            linha = linha.trim();

            if (linha.isEmpty()) {

                continue;

            }

            StringTokenizer st = new StringTokenizer(linha);
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            String resposta = null;

            for (int i = 0; i < D; i++) {

                st = new StringTokenizer(br.readLine());

                String data = st.nextToken();
                boolean todosPodem = true;

                for (int j = 0; j < N; j++) {

                    int disponibilidade = Integer.parseInt(st.nextToken());

                    if (disponibilidade == 0) {

                        todosPodem = false;

                    }

                }

                if (resposta == null && todosPodem) {

                    resposta = data;

                }

            }

            if (resposta != null) {

                System.out.println(resposta);

            } else {

                System.out.println("Pizza antes de FdI");

            }

        }

    }

}