package aulas.colecoes.mapa;

import aulas.colecoes.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Pessoa> funcionarios = new HashMap<>();
        
        funcionarios.put("123.456.789-78", new Pessoa("Joao", 21));
        funcionarios.put("789.456.789-78", new Pessoa("Maria", 32));
    }
}
