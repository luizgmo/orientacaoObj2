package exercicios.lista2013.ex226;


public class Main {
    public static void main(String[] args) {
        PONTO2D ponto1 = new PONTO2D(1,1);
        PONTO2D ponto2 = new PONTO2D(5,5);
    
        LINHA2D linha = new LINHA2D(ponto1,ponto2);
    
        linha.mostrarPontos();
        
        System.out.println("Comprimento da linha: " + linha.calcularComprimento());
    }

}
