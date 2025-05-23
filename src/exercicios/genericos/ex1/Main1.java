package exercicios.genericos.ex1;

public class Main1 {
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4};
        Integer[] intArray2 = {1, 2, 3, 4};
        Integer[] intArray3 = {1, 2, 4, 3};

        String[] strArray1 = {"lucas", "luiz", "mateus"};
        String[] strArray2 = {"lucas", "luiz", "mateus"};
        String[] strArray3 = {"lucas", "tchau", "oi"};

        System.out.println("intArray1 e intArray2 são iguais? " + Ordem.verificarOrdem(intArray1, intArray2));
        System.out.println("intArray1 e intArray3 são iguais? " + Ordem.verificarOrdem(intArray1, intArray3));

        System.out.println("strArray1 e strArray2 são iguais? " + Ordem.verificarOrdem(strArray1, strArray2));
        System.out.println("strArray1 e strArray3 são iguais? " + Ordem.verificarOrdem(strArray1, strArray3));
        
    }
}

