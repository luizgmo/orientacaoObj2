package exercicios.lista2013.ex1216_17;

import java.util.ArrayList;

public class ListaDePalavras {
    private ArrayList<String> lista;

    public ListaDePalavras() {
        lista = new ArrayList<>();
    }

    public void adicionar(String palavra) {
        lista.add(palavra);
    }
    
    public boolean remover(String palavra) {
        if (lista.contains(palavra)){
            lista.remove(palavra);
            return true;
        } else{
            return false;
        }
    }
    
    public int conta(String palavra) {
        int contador = 0;
        
        for (String str : lista) {
            if (str.equals(palavra)) {
                contador++;
            }
        }
        return contador;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        
        for( String str : lista ) {
            resultado += str + " ";
        }
        
        return resultado;
    }
}
