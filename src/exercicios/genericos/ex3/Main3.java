package exercicios.genericos.ex3;

import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        List<String> cores = Arrays.asList("vermelho", "verde", "azul", "amarelo");

        int indice1 = BuscaGenerica.encontrarIndice(numeros, 30);
        System.out.println("Índice do 30 na lista de números: " + indice1);

        int indice2 = BuscaGenerica.encontrarIndice(numeros, 100);
        System.out.println("Índice do 100 na lista de números: " + indice2);

        int indice3 = BuscaGenerica.encontrarIndice(cores, "azul");
        System.out.println("Índice de 'azul' na lista de cores: " + indice3);

        int indice4 = BuscaGenerica.encontrarIndice(cores, "rosa");
        System.out.println("Índice de 'rosa' na lista de cores: " + indice4);

        int indice5 = BuscaGenerica.encontrarIndice(cores, null);
        System.out.println("Índice de null na lista de cores: " + indice5);
    }
}