package aulas.classe.metodos.argumentos;

public class Calculadora {
 
    public double somatoria(double... numeros){
        double resultado = 0;
        
        for(int i = 0; i < numeros.length; i++){
            resultado += numeros[i];
        }
        
        return resultado;
    }
    
}
