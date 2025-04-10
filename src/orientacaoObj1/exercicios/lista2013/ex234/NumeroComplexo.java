package exercicios.lista2013.ex234;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;
    
    public void inicializaNumero(double real, double imaginaria){
        parteReal = real;
        parteImaginaria = imaginaria;
    }
    
    public void imprimeNumero(){
        System.out.println(parteReal + " + " + parteImaginaria + "i");
    }
    
    public boolean eIgual(NumeroComplexo outro){
        return parteReal == outro.parteReal && parteImaginaria == outro.parteImaginaria;
    }
    
    public NumeroComplexo soma(NumeroComplexo outro){
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.inicializaNumero(parteReal + outro.parteReal, parteImaginaria + outro.parteImaginaria);
        return resultado;
    }
    
    public NumeroComplexo subtrai(NumeroComplexo outro){
        NumeroComplexo resultado = new NumeroComplexo();
        resultado.inicializaNumero(parteReal - outro.parteReal, parteImaginaria - outro.parteImaginaria);
        return resultado;
    }
    
    public NumeroComplexo multiplica(NumeroComplexo outro){
        NumeroComplexo resultado = new NumeroComplexo();
        double real = (parteReal * outro.parteReal) - (parteImaginaria * outro.parteImaginaria);
        double imaginaria = (parteReal * outro.parteImaginaria) + (parteImaginaria * outro.parteReal);
        resultado.inicializaNumero(real, imaginaria);
        return resultado;       
    }
    
    public NumeroComplexo divide(NumeroComplexo outro){
        NumeroComplexo resultado = new NumeroComplexo();
        double denominador = (outro.parteReal * outro.parteReal) + (outro.parteImaginaria * outro.parteImaginaria);
        double real = ((parteReal * outro.parteReal) + (parteImaginaria * outro.parteImaginaria)) / denominador;
        double imaginaria = ((parteImaginaria * outro.parteReal) - (parteReal * outro.parteImaginaria)) / denominador;
        resultado.inicializaNumero(real, imaginaria);
        return resultado;
    }
}
