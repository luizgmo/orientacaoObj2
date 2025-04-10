package exercicios.lista2013.ex88;

import exercicios.lista2013.ex27.Lampada;

public class LampadaFluorescente extends Lampada{
    private double comprimento;
    
    public LampadaFluorescente(boolean estadoInicial, double c){
        if (estadoInicial == true){
            acende();
        } else{
            apaga();
        }
        setComprimento(c);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public void mostraEstado() {
        super.mostraEstado();
        System.out.println("Comprimento da lâmpada: " + comprimento + "cm");
    }
    
    

}
