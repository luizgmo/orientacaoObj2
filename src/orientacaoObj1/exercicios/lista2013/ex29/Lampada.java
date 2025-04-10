package exercicios.lista2013.ex29;

public class Lampada {
    boolean estadoDaLampada;
    double watts;
    
    public Lampada(double w){
        setWatts(w);
    }

    private double getWatts() {
        return watts;
    }

    private void setWatts(double watts) {
        this.watts = watts;
    }
    
    public void acende(){
        estadoDaLampada = true;
    }
    
    public void apaga(){
        estadoDaLampada = false;
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
