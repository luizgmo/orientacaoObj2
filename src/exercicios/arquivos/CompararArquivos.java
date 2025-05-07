package exercicios.arquivos;

import java.io.FileReader;
import java.io.IOException;

public class CompararArquivos {
    public static void main(String[] args) {
        String caminho1 = "./Arquivo1.txt";
        String caminho2 = "./Arquivo2.txt";

        try (FileReader reader1 = new FileReader(caminho1);
             FileReader reader2 = new FileReader(caminho2)) {

            int c1, c2;
            do {
                c1 = reader1.read();
                c2 = reader2.read();
                if (c1 != c2) {
                    break;
                }
            } while (c1 != -1 && c2 != -1);

            if (c1 == c2) {
                System.out.println("Os arquivos são iguais lexicograficamente.");
            } else if (c1 < c2) {
                System.out.println("Arquivo1.txt vem antes de Arquivo2.txt lexicograficamente.");
            } else {
                System.out.println("Arquivo2.txt vem antes de Arquivo1.txt lexicograficamente.");
            }
        } catch (IOException ex) {
            System.out.println("Erro ao ler arquivos: " + ex.getMessage());
        }
    }
}
