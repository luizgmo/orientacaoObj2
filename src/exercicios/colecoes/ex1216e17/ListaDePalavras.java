package exercicios.colecoes.ex1216e17;

import java.util.HashMap;
import java.util.Map;

public class ListaDePalavras {
    private Map<Integer, String> palavras;
    private int indice;

    public ListaDePalavras() {
        palavras = new HashMap<>();
        indice = 0;
    }

    public void adicionar(String palavra) {
        palavras.put(indice++, palavra);
    }
    
    public int conta(String palavra) {
        int contador = 0;
        for (int i = 0; i < indice; i++) {
            if (palavra.equals(palavras.get(i))) {
                contador++;
            }
        }
        return contador;
    }
    
    @Override
    public String toString() {
        return palavras.values().toString();
    }
}