package exercicios.lista2013.ex229;

public class ContaBancariaSimplificada {
    private String nomeCorrentista;
    private double saldo;
    private boolean contaEspecial;
    
    public ContaBancariaSimplificada(String nomeCorrentista, double saldo, boolean contaEspecial){
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
        this.contaEspecial = contaEspecial;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void retirar(double valor){
        if ((contaEspecial == false) && (valor <= saldo)){
            saldo -= valor;
        } else if(contaEspecial == true){
            saldo -= valor;
        } else{
            System.out.println("A conta não é especial e não possui saldo suficiente para retirada.");
        }
    }
    
    public void mostrarDados(){
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("Saldo: " + saldo);
        if (contaEspecial){
            System.out.println("A conta é especial.");
        } else{
            System.out.println("A conta não é especial.");
        }
    }
    
}
