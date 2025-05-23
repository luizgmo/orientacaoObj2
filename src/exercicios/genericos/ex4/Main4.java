package exercicios.genericos.ex4;

import java.util.Arrays;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Luiz", "Mateus", "Ana");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<String> nomesInvertidos = Inverter.inverterLista(nomes);
        List<Integer> numerosInvertidos = Inverter.inverterLista(numeros);

        System.out.println("Lista original de nomes: " + nomes);
        System.out.println("Lista invertida de nomes: " + nomesInvertidos);

        System.out.println("Lista original de números: " + numeros);
        System.out.println("Lista invertida de números: " + numerosInvertidos);
    }
}