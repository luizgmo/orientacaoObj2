package exercicios.ex1;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz(2);

        m.setElemento(0, 0, 5.0);
        m.setElemento(0, 1, 2.0);
        m.setElemento(1, 0, 3.0);
        m.setElemento(1, 1, 4.0);

        System.out.println("Matriz Original:");
        System.out.println(m);

        m.adicionar(3.0);
        System.out.println("Matriz após adicionar 3.0:");
        System.out.println(m);

        m.subtrair(1.0);
        System.out.println("Matriz após subtrair 1.0:");
        System.out.println(m);

        m.multiplicar(2.0);
        System.out.println("Matriz após multiplicar por 2.0:");
        System.out.println(m);

        m.dividir(2.0);
        System.out.println("Matriz após dividir por 2.0:");
        System.out.println(m);

        System.out.println("Maior valor na matriz: " + m.encontrarMaior());
        System.out.println("Menor valor na matriz: " + m.encontrarMenor());

        System.out.println("Determinante da matriz: " + m.calcularDeterminante());
        
    }
}
