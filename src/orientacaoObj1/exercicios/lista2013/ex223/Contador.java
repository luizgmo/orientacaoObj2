package exercicios.lista2013.ex223;

public class Contador {
    private int valor;
    
    public Contador(){
        valor = 0;
    }
    
    public void zerarValor(){
        valor = 0;
    }
    
    public void incrementarValor(){
        valor++;
    }
    
    public void imprimirValor(){
        System.out.println("Valor do contador: " + valor);
    }
}
