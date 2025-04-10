package exercicios.lista2013.ex29;

public class Main {
    public static void main(String[] args) {
        
        Lampada lamp = new Lampada(30);
        Lampada lamp2 = new Lampada(50);
        
        lamp.mostraEstado();
        
        lamp.acende();
        
        lamp.mostraEstado();
        
        lamp.apaga();
        
        lamp.mostraEstado();
        
        lamp.eEconomica();
        lamp2.eEconomica();
    }
}
