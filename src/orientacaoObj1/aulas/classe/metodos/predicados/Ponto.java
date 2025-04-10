package aulas.classe.metodos.predicados;

public class Ponto {
    private double x, y;
    private boolean xPositivo, yPositivo;

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // metodo predicado é um get para campo booleano, onde se utiliza is e nao get
    public boolean isXPositivo() {
        return xPositivo;
    }

    public boolean isYPositivo() {
        return yPositivo;
    }

    public void setX(double x) {
        this.x = x;
        setXPositivo(x >= 0);
    }

    public void setY(double y) {
        this.y = y;
        if (y >= 0){
            setYPositivo(true);
        } else{
            setYPositivo(false);
        }
    }

    private void setXPositivo(boolean xPositivo) {
        this.xPositivo = xPositivo;
    }

    private void setYPositivo(boolean yPositivo) {
        this.yPositivo = yPositivo;
    }

}
