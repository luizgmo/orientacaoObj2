package aulas.colecoes.lista;

import aulas.colecoes.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 21);
        Pessoa p2 = new Pessoa("Maria", 32);
        Pessoa p3 = new Pessoa("Carlos", 17);
        
        List<Pessoa> lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        System.out.println(lista);
        
        Collections.sort(lista);
        
        System.out.println(lista);
        
        System.out.println(Collections.min(lista));
        System.out.println(Collections.max(lista));
        
    }
}
