package aulas.classe.basico;

public class Pessoa {
    
    // construtor padrao (se nao exister a JVM cria), aloca memoria para os atributos
    /*public Pessoa(){
        
    }*/
    
    // construtor personalizado, com inicializaçao de atributos por passagem de parametros
    public Pessoa(double a, char s){
        altura = a;
        sexo = s;
        calcularPesoIdeal();
    }
    
    // atributos
    public double altura;
    public char sexo;
    public double pesoIdeal;
    
    // métodos (operações)
    public void calcularPesoIdeal(){
        
        if ((sexo == 'F') || (sexo == 'f')){
            
            pesoIdeal = 62.1 * altura - 44.7;
            
        } else{
            if ((sexo == 'M') || (sexo == 'm')){
                pesoIdeal = 72.7 * altura - 58;
            }
        }
        
    }
    
}
