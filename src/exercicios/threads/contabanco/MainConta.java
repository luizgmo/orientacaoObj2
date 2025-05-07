package exercicios.threads.contabanco;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500);

        Depositante depositante = new Depositante(conta, 1000);
        Sacador sacador = new Sacador(conta, 700);

        ExecutorService executorThreads = Executors.newCachedThreadPool();

        executorThreads.execute(depositante);
        executorThreads.execute(sacador);

        executorThreads.shutdown();
    }
}