package exercicios.threads.prodcon;

import java.util.ArrayList;

public class Buffer {
    private ArrayList<Integer> valores = new ArrayList<>();
    private int capacidade;
    private boolean finalizado = false;
    
    public Buffer(int capacidade){
        this.capacidade = capacidade;
    }
    
    public synchronized void set(int valor) throws Exception{
        while(valores.size() >= capacidade){
            System.out.println("Buffer cheio. Produtor esperando...");
            wait();
        }
        
        valores.add(valor);
        System.out.println("Produzido: " + valor + " | Tamanho: " + valores.size());
        notifyAll();
    }
    
    public synchronized int get() throws Exception{
        while(valores.isEmpty() && !finalizado){
            System.out.println("Buffer vazio. Consumidor esperando...");
            wait();
        }
        
        if(valores.isEmpty() && finalizado) {
            return -1;
        }
        
        int valor = valores.remove(0);
        System.out.println("Consumido: " + valor + " | Tamanho: " + valores.size());
        notifyAll();
        return valor;
    }
    
    public synchronized void finalizar(){
        this.finalizado = true;
        notifyAll();
    }
}