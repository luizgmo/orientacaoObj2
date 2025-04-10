package aulas.polimorfismo.interface_;

// Assalariado herda os metodos concretos e abstratos de Empregado, inclusive os assinados na interface Pagavel pois Empregado "implements" a interface Pagavel
public class Assalariado extends Empregado{
    
    private double salario;

    public Assalariado(String nome, String cpf, double salario) {
        super(nome, cpf);
        setSalario(salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
        }
    }

    @Override
    public double proventoSemanal() {
        return getSalario()/4;
    }
    
    // metodo abstrato assinado na interface Pagavel
    @Override
    public double getValor(){
        return proventoSemanal();
    }
     
}