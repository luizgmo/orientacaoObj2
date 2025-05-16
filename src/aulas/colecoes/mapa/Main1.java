package aulas.colecoes.mapa;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        // chave (imutavel) --> valor
        Map<String, Double> notas = new HashMap<>();
        
        notas.put("Joao", 5.5);
        notas.put("Maria", 9.0);
        notas.put("Carlos", 2.0);
        
        System.out.println(notas.get("Joao"));
        
        for (String chave : notas.keySet()){
            double valor = notas.get(chave);
            System.out.println(chave + " : " + valor);
        }
        
        notas.put("Joao", 10.0);
        System.out.println(notas.get("Joao"));

    }
}
