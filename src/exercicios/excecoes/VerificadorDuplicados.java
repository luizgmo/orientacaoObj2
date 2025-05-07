package exercicios.excecoes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerificadorDuplicados {
    public void verificarDuplicados(List<Integer> lista) throws Exception{
        Set<Integer> conjunto = new HashSet<>();
        Set<Integer> duplicados = new HashSet<>();

        for (Integer numero : lista) {
            if (!conjunto.add(numero)) {
                duplicados.add(numero);
            }
        }

        if (!duplicados.isEmpty()) {
            throw new Exception("Números duplicados encontrados: " + duplicados);
        }
    }
}
