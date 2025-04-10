package exercicios.lista2013.ex919;

public class LampadaDeNatal implements Lampada{
    private boolean estadoDaLampada;
    private Cor cor;
    
    public enum Cor{
        VERMELHO,
        VERDE,
        AZUL
    }

    public LampadaDeNatal(Cor cor) {
        this.cor = cor;
    }

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
            System.out.println("A lâmpada de Natal está acesa na cor " + cor + ".");
        } else {
            System.out.println("A lâmpada de Natal está apagada.");
        }
    }
}
