package aulas.variavel.composta;

public class OperadorArray {
    
    private OperadorArray(){} // impede a criaçao de objetos da classe OperadorArray
    
    public static int soma(int[] vetor){
        int resultado = 0;
        for (int v : vetor){
            resultado += v;
        }
        return resultado;
    }
    
    public static void preencher(int[] vetor, int valor){
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = valor;
        }
    }
}
