package exercicios.genericos.ex3;

import java.util.List;

public class BuscaGenerica {

    public static <T> int encontrarIndice(List<T> lista, T target) {
        if (lista == null) {
            return -1;
        }
        for (int i = 0; i < lista.size(); i++) {
            if (target == null) {
                if (lista.get(i) == null) {
                    return i;
                }
            } else if (target.equals(lista.get(i))) {
                return i;
            }
        }
        return -1;
    }
}