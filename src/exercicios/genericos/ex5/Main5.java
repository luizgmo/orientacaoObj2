package exercicios.genericos.ex5;

import java.util.Arrays;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<String> listaA = Arrays.asList("A", "B", "C");
        List<String> listaB = Arrays.asList("1", "2", "3", "4");

        List<String> listaMesclada = JuntarListas.juntarListas(listaA, listaB);

        System.out.println("Lista A: " + listaA);
        System.out.println("Lista B: " + listaB);
        System.out.println("Lista Mesclada Alternada: " + listaMesclada);
    }
}