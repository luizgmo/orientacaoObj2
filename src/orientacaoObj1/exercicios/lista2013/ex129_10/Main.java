package exercicios.lista2013.ex129_10;

public class Main {
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras();
        
        conjunto.adicionar("maverick");
        conjunto.adicionar("c14");
        
        conjunto.remover("maverick");
        
        System.out.println(conjunto);
    }
}

