package exercicios.threads.prodcon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);
        
        Produtor produtor = new Produtor(buffer, 1000);
        Consumidor consumidor = new Consumidor(buffer, 500);
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        executorThreads.execute(produtor);
        executorThreads.execute(consumidor);
        
        executorThreads.shutdown();
    }
}