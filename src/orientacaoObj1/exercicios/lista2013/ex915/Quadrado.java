package exercicios.lista2013.ex915;
import exercicios.lista2013.ex219.PONTO2D;

public class Quadrado extends Retangulo {

    public Quadrado(PONTO2D ponto, double lado) {
        super(ponto, new PONTO2D(ponto.getX() + lado, ponto.getY() + lado));
    }

    @Override
    public double calculaArea() {
        double lado = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        double lado = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        return 4 * lado;
    }

    @Override
    public String toString() {
        double lado = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        return "Quadrado com canto em " + primeiroCanto + " e lado " + lado;
    }
}