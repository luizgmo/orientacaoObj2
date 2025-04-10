package exercicios.lista2013.ex914;
import exercicios.lista2013.ex219.PONTO2D;

public class Quadrado implements ObjetoGeometrico{
    private PONTO2D ponto;
    private double lado;
    
    public Quadrado(PONTO2D ponto, double lado){
        this.ponto = ponto;
        this.lado = lado;
    }

    @Override
    public PONTO2D centro() {
        double centroX = ponto.getX() + lado / 2;
        double centroY = ponto.getY() - lado / 2;
        return new PONTO2D(centroX, centroY);
    }
    
    @Override
    public double calculaArea() {
        return lado * lado;
    }
    
    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado com ponto " + ponto + " e lado " + lado;
    }

}
