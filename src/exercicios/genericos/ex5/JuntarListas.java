package exercicios.genericos.ex5;

import java.util.ArrayList;
import java.util.List;

public class JuntarListas {
    public static <T> List<T> juntarListas(List<T> lista1, List<T> lista2){
        List<T> resultado = new ArrayList<>();
        int tamanho1 = lista1.size();
        int tamanho2 = lista2.size();
        int max = Math.max(tamanho1, tamanho2);
        
        for (int i = 0; i < max; i++){
            if (i < tamanho1){
                resultado.add(lista1.get(i));
            }
            
            if (i < tamanho2){
                resultado.add(lista2.get(i));
            }
        }
        return resultado;
    }
}
