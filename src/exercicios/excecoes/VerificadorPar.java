package exercicios.excecoes;

public class VerificadorPar {
    public void verificarPar(int numero) throws Exception{
        if (numero % 2 != 0){
            throw new Exception("O número " + numero + " é ímpar!");
        }
        System.out.println("O número " + numero + " é par!");
    }
}
