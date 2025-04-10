package exercicios.lista2013.ex129_10;

import java.util.ArrayList;


public class ConjuntoDePalavras {
    private ArrayList<String> lista;

    public ConjuntoDePalavras() {
        lista = new ArrayList();
    }
    
    public boolean adicionar(String palavra) {
        if( lista.contains(palavra) ) {
            return false;
        } else {
            lista.add(palavra);
            return true;
        } 
    }
    
    public boolean remover(String palavra) {
        if (lista.contains(palavra)){
            lista.remove(palavra);
            return true;
        } else{
            return false;
        }
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
