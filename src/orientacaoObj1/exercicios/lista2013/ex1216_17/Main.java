package exercicios.lista2013.ex1216_17;

public class Main {
    public static void main(String[] args) {
        ListaDePalavras lista = new ListaDePalavras();
        
        lista.adicionar("maverick");
        lista.adicionar("c14");
        lista.adicionar("maverick");
        
        System.out.println(lista);
        System.out.println(lista.conta("maverick"));
    }
}
