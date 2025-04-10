package aulas.heranca.object;

// CentroDoCirculo "é um" (relacionamento) Ponto.

public class CentroDoCirculo extends Ponto{
    
    public CentroDoCirculo(){
        // chama implicitamente o construtor sem parametros da superclasse Ponto
    }
    
    public CentroDoCirculo(double x, double y){
        super(x, y);
    }
    
    @Override
    public String toString(){
        String resultado;
        
        System.out.println(super.toString()); // da classe Ponto
        
        resultado = "O centro do circulo é (" + getX() + ", " + getY() + ")";
        
        return resultado;
    }
}
