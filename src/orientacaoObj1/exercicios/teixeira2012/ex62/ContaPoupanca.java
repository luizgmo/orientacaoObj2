package exercicios.teixeira2012.ex62;

public class ContaPoupanca extends Conta implements Investimento{
    public ContaPoupanca(int numero, String nome_titular, double saldo) {
        super(numero, nome_titular, saldo);
    }

    public ContaPoupanca(int numero, String nome_titular) {
        super(numero, nome_titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void reajustar(double taxa) {
        if (taxa > 0) {
            saldo += saldo * taxa / 100;
        }
    }
}
