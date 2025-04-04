package aulas.excecoes;

public class Exemplo1 {
    public static void main(String[] args) {
        String[] vetor = new String[5];
        
        vetor[0] = "IFSP";
        
        System.out.println(vetor[0]);
        System.out.println(vetor[0].toLowerCase());
        
        System.out.println(vetor[1]);
//      System.out.println(vetor[1].toUpperCase()); gera a excecao NullPointerException

        System.out.println(vetor[4]);
        System.out.println(vetor[5]); // gera a excecao ArrayIndexOutOfBoundsException
    }
}
