package exercicios.lista2013.ex917;
import exercicios.lista2013.ex219.PONTO2D;

public class Retangulo implements ObjetoGeometrico
{
    public PONTO2D primeiroCanto, segundoCanto;

    Retangulo(PONTO2D pc, PONTO2D sc)
    {
        primeiroCanto = pc;
        segundoCanto = sc;
    }

    @Override
    public PONTO2D centro()
    {
        double coordX = (primeiroCanto.getX() + segundoCanto.getX()) / 2.0;
        double coordY = (primeiroCanto.getY() + segundoCanto.getY()) / 2.0;
        return new PONTO2D(coordX, coordY);
    }

    @Override
    public double calculaArea()
    {
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return ladoX * ladoY;
    }

    @Override
    public double calculaPerimetro()
    {
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return 2 * (ladoX + ladoY);
    }
    
    public static void main(String[] args) {
        PONTO2D p1 = new PONTO2D(2, 3);
        PONTO2D p2 = new PONTO2D(6, 7);

        Retangulo retangulo = new Retangulo(p1, p2);

        // falha
        System.out.println("Descrição: " + retangulo.toString());
    }

}

