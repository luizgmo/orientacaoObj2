package exercicios.lista2013.ex413;

public class NumeroComplexo{
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double r, double i){
        setParteReal(r);
        setParteImaginaria(i);
    }

    public NumeroComplexo(double r){
        setParteReal(r);
        setParteImaginaria(0);
    }

    public NumeroComplexo(){
        setParteReal(0);
        setParteImaginaria(0);
    }

    private void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    private void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public void imprimeNumero(){
        System.out.println(parteReal + " + " + parteImaginaria + "i");
    }

    public boolean eIgual(NumeroComplexo outro){
        return parteReal == outro.parteReal && parteImaginaria == outro.parteImaginaria;
    }

    public NumeroComplexo soma(NumeroComplexo outro){
        return new NumeroComplexo(parteReal + outro.parteReal, parteImaginaria + outro.parteImaginaria);
    }

    public NumeroComplexo subtrai(NumeroComplexo outro){
        return new NumeroComplexo(parteReal - outro.parteReal, parteImaginaria - outro.parteImaginaria);
    }

    public NumeroComplexo multiplica(NumeroComplexo outro){
        double real = (parteReal * outro.parteReal) - (parteImaginaria * outro.parteImaginaria);
        double imaginaria = (parteReal * outro.parteImaginaria) + (parteImaginaria * outro.parteReal);
        return new NumeroComplexo(real, imaginaria);
    }

    public NumeroComplexo divide(NumeroComplexo outro){
        double denominador = (outro.parteReal * outro.parteReal) + (outro.parteImaginaria * outro.parteImaginaria);
        double real = ((parteReal * outro.parteReal) + (parteImaginaria * outro.parteImaginaria)) / denominador;
        double imaginaria = ((parteImaginaria * outro.parteReal) - (parteReal * outro.parteImaginaria)) / denominador;
        return new NumeroComplexo(real, imaginaria);
    }
}
