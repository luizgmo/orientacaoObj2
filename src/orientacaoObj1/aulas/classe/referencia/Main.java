package aulas.classe.referencia;

public class Main {
    public static void main(String[] args) {
        int var = 13;
        System.out.println("var: " + var);
        
        Operador op = new Operador();
        
        // sera passado uma copia do valor contido em var
        op.zerarInteiro(var);
        System.out.println("var :" + var);
        
        ValorInteiro vInt = new ValorInteiro(53);
        System.out.println("vInt getValor(): " + vInt.getValor());
        
        op.zerarValorInteiro(vInt);
        System.out.println("vInt getValor(): " + vInt.getValor());
    }
}
