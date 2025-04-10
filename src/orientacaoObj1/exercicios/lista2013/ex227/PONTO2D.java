package exercicios.lista2013.ex227;

public class PONTO2D {
    
    private double x;
    private double y;
    
    public PONTO2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void mostrarCoordenadas(){
        System.out.println("(" + x + ", " + y + ")");
    }
}