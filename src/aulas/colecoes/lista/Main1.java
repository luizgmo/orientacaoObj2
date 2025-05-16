package aulas.colecoes.lista;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("amarelo");
        lista.add("azul");
        lista.add("verde");
        lista.add("branco");
        
        System.out.println(lista);
        
        // padrao de design orientado a objetos
        Iterator<String> iterator = lista.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("-----");
        
        // vantagem do arraylist: baixo custo de processamento para acesso direto
        System.out.println(lista.get(2));
        
        // desvantagem do arraylist: alto custo de processamento para inserçao e remoçao em pontos especificos
        lista.add(1, "rosa");
        System.out.println(lista);
        
        System.out.println("-----");
        
        String[] cores = {"marrom", "roxo", "preto"};
        
        // vantagem do linkedlist: baixo custo de processamento para acesso direto, inserçao e remoçao em pontos especificos
        List<String> lista2 = new LinkedList<>(Arrays.asList(cores));
        
        System.out.println(lista2);
        
        lista2.add(1, "vermelho");
        
        System.out.println(lista2);
        
        System.out.println("-----");
        
        Collections.sort(lista);
        
        System.out.println(Collections.binarySearch(lista, "preto"));
        System.out.println(Collections.binarySearch(lista, "roxo"));
        System.out.println(Collections.binarySearch(lista, "azul"));
        
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);
        
        System.out.println(Collections.frequency(lista, "azul"));
        
        Collections.shuffle(lista);
        System.out.println(lista);
        
        Collections.fill(lista2, "verde");
        System.out.println(lista2);
        
        System.out.println("-----");
        
        List<String> listaVis = Collections.unmodifiableList(lista);
        
        System.out.println(listaVis.get(2));
        
        // listaVis.add("cinza");
        
        // listaSinc pode ser passada e alterada para/em multiplas linhas de execuçao(threads) de forma segura
        List<String> listaSinc = Collections.synchronizedList(lista);
    }
}
