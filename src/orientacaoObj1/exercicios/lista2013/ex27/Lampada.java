package exercicios.lista2013.ex27;

public class Lampada {
    
    private boolean estadoDaLampada;
    
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
}
