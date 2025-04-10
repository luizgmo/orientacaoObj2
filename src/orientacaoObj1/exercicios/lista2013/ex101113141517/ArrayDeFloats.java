package exercicios.lista2013.ex101113141517;

public class ArrayDeFloats {
    private float[] array;
    
    public ArrayDeFloats(int numero){
        array = new float[numero];
    }
    
    public ArrayDeFloats(int numero, float v){
        array = new float[numero];
        for (int i = 0; i < array.length; i++) {
            array[i] = v;
        }
    }
    
    public int tamanho(){
        return array.length;
    }
    
    public void modifica(int pos, float v){
        if ((pos >= 0) && (pos < array.length)){
            array[pos] = v;
        }
    }
    
    public float valor(int pos){
        if ((pos >= 0) && (pos < array.length)){
            return array[pos];
        } else{
            return Float.NaN;
        }
    }
    
    public float[] paraArray(){
        return array;
    }
    
    public float menorValor(){
        float menor = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < menor){
                menor = array[i];
            }
        }
        return menor;
    }
    
    public float maiorValor(){
        float maior = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }
        return maior;
    }

    @Override
    public String toString() {
        String resultado = "O array tem " + array.length + " elementos:\n";
        for (int i = 0; i < array.length; i++){
            resultado += array[i] + " ";
        }
        return resultado;
    }
    
    public boolean eIgual(ArrayDeFloats outro){
        if (this.tamanho() != outro.tamanho()){
            return false;
        }
        
        for (int i = 0; i < this.tamanho(); i++) {
            if (this.valor(i) != outro.valor(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public void soma(float v){
        for (int i = 0; i < array.length; i++){
            array[i] += v;
        }
    }
    
    public float total(){
        float total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total;
    }
    
    public boolean existe(float v){
        for (int i = 0; i < array.length; i++){
            if (array[i] == v){
                return true;
            }
        }
        return false;
    }
}
