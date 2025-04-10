package exercicios.lista2013.ex42;

public class Lampada {
    
    boolean estadoDaLampada;
    
    public Lampada(boolean e){
        setEstadoDaLampada(e);
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
}