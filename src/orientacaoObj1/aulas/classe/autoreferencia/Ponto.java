package aulas.classe.autoreferencia;

public class Ponto {
    private double x, y;
    
    public void imprimirA(double x, double y){
        // parametros ocultam campos de mesmo nome
        System.out.println("(" + x + ", " + y + ")");
    }
    
    public void imprimirB(double x, double a){
        // a variavel local sombreia o atributo no escopo do metodo
        // o this aponta para a variavel de instancia
        System.out.println("(" + this.x + ", " + y + ")");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
    
    
}
