package aulas.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {
        File arq = new File("./Arquivo2.txt");
        
        FileWriter writer;
        
        try{
            if (arq.exists()){
                writer = new FileWriter(arq, true); // se o arquivo ja existe ele adiciona o conteudo no arquivo existente
            } else{
                writer = new FileWriter(arq); // se o arquivo nao existe ele cria um arquivo com o conteudo
            }
            writer.write("Este é o conteúdo do Arquivo2.txt\n\n");
            writer.close();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
