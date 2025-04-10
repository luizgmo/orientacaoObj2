package aulas.classe.metodos.argumentos;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        double aux = calc.somatoria(15, 5.5);
        System.out.println(aux);
        
        double[] vetor = new double[3];
        vetor[0] = 6;
        vetor[1] = 5;
        vetor[2] = 2;
        
        aux = calc.somatoria(vetor);
        System.out.println(aux);
        
    }
}
