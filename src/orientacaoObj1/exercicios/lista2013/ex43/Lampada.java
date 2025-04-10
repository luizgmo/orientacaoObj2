package exercicios.lista2013.ex43;

public class Lampada {
    boolean estadoDaLampada;
    double watts;
    
    public Lampada(double w){
        setWatts(w);
    }
    
    public Lampada(){
        setWatts(60);
    }

    private void setWatts(double watts) {
        this.watts = watts;
    }
    
    private void setEstadoDaLampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }
    
    public void acende(){
        setEstadoDaLampada(true);
    }
    
    public void apaga(){
        setEstadoDaLampada(false);
    }
    
    public void mostraEstado(){
        if (estadoDaLampada == true){
            System.out.println("A lâmpada está acesa");
        } else{
            System.out.println("A lâmpada está apagada");
        }
    }
    
    public void eEconomica(){
        if (watts < 40){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
    
    
}

