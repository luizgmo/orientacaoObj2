package aulas.colecoes.arrayList;

import java.util.ArrayList;
import aulas.variavel.composta.Ponto;

public class Main {
    public static void main(String[] args) {
        
        // ArrayList<Object> lista = new ArrayList();
        
        ArrayList lista = new ArrayList(); // esta implicito o uso do generico Object (linha 9)
        
        lista.add(13); // 0
        lista.add(3); // 1
        lista.add(1); // 2
        lista.add(2); // 3
        lista.add(-1); // 4
        
        System.out.println(lista.get(2));
        System.out.println(lista.contains(51));
        System.out.println(lista.contains(2));
        System.out.println(lista.size());
        
        System.out.println("-------------");
        
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("-------------");
        
        lista.set(1, 50);
        
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("-------------");
        
        lista.remove(2);
        
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("-------------");
        
        int k = lista.indexOf(2);
        lista.remove(k); // remove onde se encontra o elemento com valor 2
        
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("-------------");
        
        ArrayList<Ponto> pontos = new ArrayList<>();
        
        pontos.add(new Ponto(5, 15));
        pontos.add(new Ponto(2, 2));
        pontos.add(new Ponto(7, 3));
        
        for (int i = 0; i < pontos.size(); i++){
            System.out.println(pontos.get(i));
        }
    }
}
