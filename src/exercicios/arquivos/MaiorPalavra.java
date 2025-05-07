package exercicios.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MaiorPalavra {
    public static void main(String[] args) {
        File arq = new File("./Arquivo2.txt");
        String maiorPalavra = "";

        try {
            FileReader reader = new FileReader(arq);
            BufferedReader buffer = new BufferedReader(reader);

            while (buffer.ready()) {
                String linha = buffer.readLine();
                String[] palavras = linha.split("\\s+");
                for (String palavra : palavras) {
                    if (palavra.length() > maiorPalavra.length()) {
                        maiorPalavra = palavra;
                    }
                }
            }
            buffer.close();
            reader.close();

            System.out.println("A maior palavra encontrada: " + maiorPalavra);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
