package exercicios.lista2013.ex919;

public class LampadaIncandescente implements Lampada {
    private boolean estadoDaLampada;

    @Override
    public void acende() {
        estadoDaLampada = true;
    }

    @Override
    public void apaga() {
        estadoDaLampada = false;
    }

    @Override
    public void mostraEstado() {
        if (estadoDaLampada) {
            System.out.println("A lâmpada incandescente está acesa.");
        } else {
            System.out.println("A lâmpada incandescente está apagada.");
        }
    }
}