package exercicios.lista2013.ex228;

import exercicios.lista2013.ex223.Contador;

public class Lampada {
    
    private boolean estadoDaLampada;
    
    private int contadorAcesa;
    
    public void acende(){
        if (estadoDaLampada == false){
            estadoDaLampada = true;
            contadorAcesa++;
        }   
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
    
    public void mostrarContador(){
        System.out.println("Vezes que a lâmpada foi acesa: " + contadorAcesa);
    }
}
