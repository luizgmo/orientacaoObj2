package exercicios.threads.contabanco;

public class ContaBancaria {
    private double saldo;
    private boolean emOperacao;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.emOperacao = false;
    }

    public synchronized void depositar(double valor) throws Exception {
        while (emOperacao) {
            System.out.println("Esperando para depositar...");
            wait();
        }
        emOperacao = true;
        saldo += valor;
        System.out.println(Thread.currentThread().getName() + " depositou: " + valor + " | Saldo: " + saldo);
        emOperacao = false;
        notifyAll();
    }

    public synchronized void sacar(double valor) throws Exception {
        while (emOperacao || saldo < valor) {
            if (saldo < valor) {
                System.out.println(Thread.currentThread().getName() + " esperando saldo suficiente para sacar " + valor + " (Saldo atual: " + saldo + ")");
            } else {
                System.out.println("Esperando para sacar...");
            }
            wait();
        }
        emOperacao = true;
        saldo -= valor;
        System.out.println(Thread.currentThread().getName() + " sacou: " + valor + " | Saldo: " + saldo);
        emOperacao = false;
        notifyAll();
    }

    public double getSaldo() {
        return saldo;
    }
}
