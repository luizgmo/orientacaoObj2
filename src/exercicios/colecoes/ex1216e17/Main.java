package exercicios.colecoes.ex1216e17;

public class Main {
    public static void main(String[] args) {
        ListaDePalavras lista = new ListaDePalavras();

        lista.adicionar("casa");
        lista.adicionar("carro");
        lista.adicionar("casa");
        lista.adicionar("bicicleta");
        lista.adicionar("carro");
        lista.adicionar("casa");

        System.out.println("Palavras na lista:");
        System.out.println(lista);
        
        System.out.println("\nNúmero de ocorrências de 'casa': " + lista.conta("casa"));
        System.out.println("Número de ocorrências de 'carro': " + lista.conta("carro"));
        System.out.println("Número de ocorrências de 'moto': " + lista.conta("moto")); 
    }
}
