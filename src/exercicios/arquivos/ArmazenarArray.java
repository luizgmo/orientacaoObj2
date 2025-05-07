package exercicios.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArmazenarArray {
    public static void main(String[] args) {
        File arq = new File("./Arquivo2.txt");

        try {
            FileReader reader = new FileReader(arq);
            BufferedReader buffer = new BufferedReader(reader);

            int linhas = 0;
            while (buffer.ready()) {
                buffer.readLine();
                linhas++;
            }
            buffer.close();
            reader.close();

            String[] vetor = new String[linhas];

            reader = new FileReader(arq);
            buffer = new BufferedReader(reader);

            int i = 0;
            while (buffer.ready()) {
                vetor[i] = buffer.readLine();
                i++;
            }

            buffer.close();
            reader.close();

            System.out.println("Conteúdo do vetor:");
            for (String linha : vetor) {
                System.out.println(linha);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
