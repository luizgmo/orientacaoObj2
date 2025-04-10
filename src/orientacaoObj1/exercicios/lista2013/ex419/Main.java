package exercicios.lista2013.ex419;

public class Main {
    public static void main(String[] args) {
        PONTO2D ponto1 = new PONTO2D(1,1);
        PONTO2D ponto2 = new PONTO2D(5,5);
    
        LINHA2D linha = new LINHA2D(ponto1,ponto2);
        
        LINHA2D linha2 = new LINHA2D();
        LINHA2D linha3 = new LINHA2D(ponto2);
        LINHA2D linha4 = new LINHA2D(2,3,4,5);
    
        linha.mostrarPontos();
        linha2.mostrarPontos();
        linha3.mostrarPontos();
        linha4.mostrarPontos();
    }

}
