package exercicios.lista2013.ex917;
import exercicios.lista2013.ex219.PONTO2D;

public interface ObjetoGeometrico {
    PONTO2D centro();
    
    double calculaArea();
    
    double calculaPerimetro();
    
    @Override
    String toString();
}
