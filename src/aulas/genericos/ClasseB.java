package aulas.genericos;

public class ClasseB {
    // o T é substituido pelo tipo de variavel que é passada como parametro
    public <T> void imprimirVetor(T vetor[]){
        for(T v : vetor) {
            System.out.println(v);
        }
        System.out.print("\n");
    }
    
    public < E extends Comparable<E> > E maximo(E valor1, E valor2, E valor3){
        E max = valor1;
        
        if (max.compareTo(valor2) < 0){
            max = valor2;
        }
        
        if (max.compareTo(valor3) < 0){
            max = valor3;
        }
        
        return max;
    }
}
