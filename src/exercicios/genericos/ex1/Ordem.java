package exercicios.genericos.ex1;

public class Ordem {
    public static <T> boolean verificarOrdem(T[] arr1, T[] arr2){
        if (arr1 == null && arr2 == null){
            return true;
        }
        if (arr1 == null || arr2 == null){
            return false;
        }
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++){
            if (!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
}
