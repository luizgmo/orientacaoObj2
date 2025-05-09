package exercicios.threads.prodcon;

public class Consumidor implements Runnable{
    private Buffer buffer;
    private int delay;

    public Consumidor(Buffer buffer, int delay) {
        this.buffer = buffer;
        this.delay = delay;
    }

    @Override
    public void run(){
        try{
            int valor;
            do{
                valor = buffer.get();
                if(valor != -1){
                    System.out.println("> " + valor);
                    Thread.sleep(delay);
                }
            } while(valor != -1);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}