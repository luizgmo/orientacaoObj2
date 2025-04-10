package exercicios.lista2013.ex419;

public class LINHA2D {
    private PONTO2D ponto1;
    private PONTO2D ponto2;
    
    public LINHA2D(){
        this.ponto1 = new PONTO2D(0, 0);
        this.ponto2 = new PONTO2D(0, 0);
    }
    
    public LINHA2D(PONTO2D ponto2){
        this.ponto1 = new PONTO2D(0, 0);
        this.ponto2 = ponto2;
    }
    
    public LINHA2D (PONTO2D ponto1, PONTO2D ponto2){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }    
    
    public LINHA2D (double x1, double y1, double x2, double y2){
        this.ponto1 = new PONTO2D(x1, y1);
        this.ponto2 = new PONTO2D(x2, y2);
    }
    
    public double calcularComprimento() {
        double deltaX = ponto2.getX() - ponto1.getX();
        double deltaY = ponto2.getY() - ponto1.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    
    public void mostrarPontos(){
        System.out.println("Ponto 1: ");
        ponto1.mostrarCoordenadas();
        System.out.println("Ponto 2: ");
        ponto2.mostrarCoordenadas();
    }
}
