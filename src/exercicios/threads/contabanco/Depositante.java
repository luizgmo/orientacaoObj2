package exercicios.threads.contabanco;

public class Depositante implements Runnable {
    private ContaBancaria conta;
    private int delay;

    public Depositante(ContaBancaria conta, int delay) {
        this.conta = conta;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                conta.depositar(200);
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}