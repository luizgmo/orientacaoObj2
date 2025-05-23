package aulas.genericos;
import aulas.colecoes.Pessoa;

public class ExemploB {
    public static void main(String[] args) {
        Integer vetorInteiros[] = {1, 5, 10};
        Double vetorDouble[] = {1.2, 5.6, 4.7};
        String vetorString[] = {"oi", "mateus", "tchau"};
        
        Pessoa vetorPessoas[] = {new Pessoa("Joao", 23), new Pessoa("Maria", 32), new Pessoa("Carlos", 18)};
        
        ClasseB objB = new ClasseB();
        
        objB.imprimirVetor(vetorInteiros);
        objB.imprimirVetor(vetorDouble);
        objB.imprimirVetor(vetorString);
        
        objB.imprimirVetor(vetorPessoas);
        
        System.out.println("-----");
        
        Pessoa maisVelho = objB.maximo(vetorPessoas[0], vetorPessoas[1], vetorPessoas[2]);
        System.out.println(maisVelho);
        
        int valorInteiroMax = objB.maximo(vetorInteiros[0], vetorInteiros[1], vetorInteiros[2]);
        System.out.println(valorInteiroMax);
        
        Double valorDoubleMax = objB.maximo(vetorDouble[0], vetorDouble[1], vetorDouble[2]);
        System.out.println(valorDoubleMax);
        
        String valorStringMax = objB.maximo(vetorString[0], vetorString[1], vetorString[2]);
        System.out.println(valorStringMax);
        
        
    }
}
