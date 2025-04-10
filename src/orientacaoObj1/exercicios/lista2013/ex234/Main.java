package exercicios.lista2013.ex234;

public class Main {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo();
        NumeroComplexo n2 = new NumeroComplexo();
        
        n1.inicializaNumero(1, 2);
        n2.inicializaNumero(5, 6);
        
        n1.imprimeNumero();
        n2.imprimeNumero();
        
        System.out.println("Soma: ");
        NumeroComplexo soma = n1.soma(n2);
        soma.imprimeNumero();
        
        System.out.println("Subtração: ");
        NumeroComplexo subtrai = n1.subtrai(n2);
        subtrai.imprimeNumero();
        
        System.out.println("Multiplicação: ");
        NumeroComplexo mult = n1.multiplica(n2);
        mult.imprimeNumero();
        
        System.out.println("Divisão: ");
        NumeroComplexo div = n1.divide(n2);
        div.imprimeNumero();
        
        boolean iguais = n1.eIgual(n2);
        System.out.println("Numeros iguais: " + iguais);
    }
}
