package exercicios.lista2013.ex229;

public class Main {
    public static void main(String[] args) {
        ContaBancariaSimplificada conta = new ContaBancariaSimplificada("luiz", 1000, false);
        
        conta.mostrarDados();
        
        conta.depositar(1500);
        
        conta.mostrarDados();
        
        conta.retirar(500);
        
        conta.mostrarDados();
        
        conta.retirar(5000);
        
        conta.mostrarDados();
    }
}
