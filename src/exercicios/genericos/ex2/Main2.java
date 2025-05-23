package exercicios.genericos.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(4);
        listaInteiros.add(5);
        
        List<Double> listaDoubles = new ArrayList();
        listaDoubles.add(1.5);
        listaDoubles.add(2.5);
        listaDoubles.add(3.5);
        listaDoubles.add(4.5);
        listaDoubles.add(5.5);

        SomaNumeros.Resultado resultadoInteiros = SomaNumeros.somarParesEImpares(listaInteiros);
        System.out.println("Lista de Inteiros: " + resultadoInteiros);

        SomaNumeros.Resultado resultadoDoubles = SomaNumeros.somarParesEImpares(listaDoubles);
        System.out.println("Lista de Doubles (considerando parte inteira): " + resultadoDoubles);
    }
}