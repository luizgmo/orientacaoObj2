package exercicios.lista2013.ex1222;

import java.util.ArrayList;

public class EliminarRepetidos {

    public static ArrayList removerRepetidos(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Lista original: " + numeros);

        ArrayList semDuplicados = removerRepetidos(numeros);
        System.out.println("Lista sem duplicados: " + semDuplicados);
    }
}