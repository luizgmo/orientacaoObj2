package exercicios.lista2013.ex227;

public class Main {
    public static void main(String[] args) {
        PONTO2D ponto1 = new PONTO2D(1,5);
        PONTO2D ponto2 = new PONTO2D(5,10);
        
        Retangulo retangulo = new Retangulo(ponto1, ponto2);
        
        retangulo.mostrarPontos();
        System.out.println("Largura: " + retangulo.calcularLargura());
        System.out.println("Altura: " + retangulo.calcularAltura());
        System.out.println("Área: " + retangulo.calcularArea());
    }
}
