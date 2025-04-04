package aulas.excecoes;

public class Exemplo2 {
    public static void main(String[] args) {
        String[] vetor = new String[5];
        
        vetor[0] = "IFSP";
        
        try{

            System.out.println(vetor[0]);
            System.out.println(vetor[0].toLowerCase());

            System.out.println(vetor[1]);
//            System.out.println(vetor[1].toUpperCase()); //gera a excecao NullPointerException

            System.out.println(vetor[4]);
            System.out.println(vetor[5]); // gera a excecao ArrayIndexOutOfBoundsException
        } catch( NullPointerException ex1){
            System.out.println("Ocorreu uma exceção NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex2){
            System.out.println(ex2.getMessage());
        }
        
        System.out.println(vetor[0]);
        
    }
}
