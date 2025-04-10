package exercicios.lista2013.ex227;

public class Retangulo {
    private PONTO2D ponto1;
    private PONTO2D ponto2;
    
    public Retangulo (PONTO2D ponto1, PONTO2D ponto2){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }
    
    public double calcularLargura(){
        return Math.abs(ponto2.getX() - ponto1.getX());
    }
    
    public double calcularAltura(){
        return Math.abs(ponto2.getY() - ponto1.getY());
    }
    
    public double calcularArea(){
        return calcularLargura() * calcularAltura();
    }
    
    public void mostrarPontos(){
        System.out.println("Ponto 1: ");
        ponto1.mostrarCoordenadas();
        System.out.println("Ponto 2: ");
        ponto2.mostrarCoordenadas();
    }
    
}
