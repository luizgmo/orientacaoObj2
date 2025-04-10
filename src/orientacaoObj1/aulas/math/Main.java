package aulas.math;

// nao precisar importar pois todas as classes do pacote lang sao incluidas por padrao
// import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        // a classe Math é estatica (static) nao precisa de instancia para executar metodos e acessar constantes
        double numero = Math.PI;
        System.out.println(numero);
        
        numero = -2.0;
        numero = Math.abs(numero);
        System.out.println(numero);
        
        numero = Math.sqrt(36);
        System.out.println(numero);
        
        numero = Math.pow(2, 3);
        System.out.println(numero);

        numero = Math.pow(36, 1.0/2.0);
        System.out.println(numero);
        
        numero = Math.exp(1);
        System.out.println(numero);
        
        System.out.println(numero == Math.E);
        
    }
}
