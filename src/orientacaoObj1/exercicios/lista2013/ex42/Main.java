package exercicios.lista2013.ex42;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(true);
        
        lampada.mostraEstado();
        
        lampada.apaga();
        lampada.mostraEstado();
    }
}
