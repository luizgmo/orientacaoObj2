package aulas.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        System.out.println(fila);
        
        Escrever pares = new Escrever(2, 2, 10, 1500, fila);
        Escrever impares = new Escrever(1, 2, 9, 500, fila);
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        // encerrar as threads
        executorThreads.shutdown();
        
        try{
            executorThreads.awaitTermination(15, TimeUnit.SECONDS);
            System.out.println(fila);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }
}
