package exercicios.genericos.ex4;

import java.util.ArrayList;
import java.util.List;

public class Inverter {
    public static <T> List<T> inverterLista(List<T> lista){
        List<T> listaInvertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--){
            listaInvertida.add(lista.get(i));
        }
        return listaInvertida;
    }
}
