package aulas.genericos;

public class ExemploA {
    public static void main(String[] args) {
        Integer vetorInteiros[] = {1, 5, 10};
        Double vetorDouble[] = {1.2, 5.6, 4.7};
        String vetorString[] = {"oi", "mateus", "tchau"};
        
        ClasseA objA = new ClasseA();
        
        objA.imprimirVetor(vetorInteiros);
        objA.imprimirVetor(vetorDouble);
        objA.imprimirVetor(vetorString);
    }
    
}
