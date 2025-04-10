package aulas.classe.encapsulamento;

public class Pessoa {
    
    private double altura;
    private char sexo;
    private double pesoIdeal;

    public Pessoa(double a, char s) {
        altura = a;
        sexo = s;
        calcularPesoIdeal();
    }
    
    // metodo de consulta/acesso ao atributo altura, que esta privado
    public double getAltura(){
        return altura;
    }
    
    // metodo de consulta/acesso ao atributo sexo, que esta privado
    public char getSexo(){
        return sexo;
    }
    
    // metodo de consulta/acesso ao atributo pesoIdeal, que esta privado
    public double getPesoIdeal(){
        return pesoIdeal;
    }
    
    private void calcularPesoIdeal(){
        
        double resultado = 0;
        
        if ((sexo == 'F') || (sexo == 'f')){
            
            resultado = 62.1 * altura - 44.7;
            
        } else{
            if ((sexo == 'M') || (sexo == 'm')){
                resultado = 72.7 * altura - 58;
            }
        }
        
        setPesoIdeal(resultado);
        
    }
    
    // metodo de modificaçao do atributo altura
    public void setAltura(double a){
        altura = a;
        calcularPesoIdeal();
    }
    
    // metodo de modificaçao do atributo sexo
    public void setSexo(char s){
        sexo = s;
        calcularPesoIdeal();
    }
    
    private void setPesoIdeal(double p){
        if (p > 0){
            pesoIdeal = p;
        }
      
    }
    
}
