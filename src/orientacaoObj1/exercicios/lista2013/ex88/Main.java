package exercicios.lista2013.ex88;

public class Main {
    public static void main(String[] args) {
        LampadaFluorescente lampada = new LampadaFluorescente(true, 50);
        lampada.mostraEstado();
        
        lampada.apaga();
        lampada.mostraEstado();
    }
}
