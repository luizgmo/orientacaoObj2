package aulas.arquivos;

import java.io.*;

public class Exemplo5 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("luiz", "123.123.123-12");
        Pessoa p2 = new Pessoa("maria", "333.333.333-33");
        
        System.out.println(p1);
        System.out.println(p2);
        
        try{
            FileOutputStream arq = new FileOutputStream("Arquivo3.txt");
            
            ObjectOutputStream stream = new ObjectOutputStream(arq);
            
            stream.writeObject(p1);
            stream.writeObject(p2);
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
