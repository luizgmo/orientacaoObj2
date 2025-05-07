package exercicios.threads.contabanco;

public class Sacador implements Runnable {
    private ContaBancaria conta;
    private int delay;

    public Sacador(ContaBancaria conta, int delay) {
        this.conta = conta;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                conta.sacar(150);
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}