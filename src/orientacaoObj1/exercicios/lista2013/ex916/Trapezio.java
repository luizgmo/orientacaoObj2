package exercicios.lista2013.ex916;
import exercicios.lista2013.ex219.PONTO2D;

public class Trapezio implements ObjetoGeometrico{
    private PONTO2D ponto;
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(PONTO2D ponto, double baseMaior, double baseMenor, double altura) {
        this.ponto = ponto;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public PONTO2D centro() {
        double centroX = ponto.getX() + (baseMaior + baseMenor) / 4;
        double centroY = ponto.getY() - altura / 2;
        return new PONTO2D(centroX, centroY);
    }
    
    @Override
    public double calculaArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
    
    @Override
    public double calculaPerimetro() {
        double lado1 = Math.sqrt(Math.pow((baseMaior - baseMenor) / 2, 2) + Math.pow(altura, 2));
        return baseMaior + baseMenor + 2 * lado1;
    }
    
    @Override
    public String toString() {
        return "Trapézio com ponto " + ponto + ", base maior " + baseMaior + ", base menor " + baseMenor + " e altura " + altura;
    }
    
}
