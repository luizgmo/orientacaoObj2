package aulas.classe.referencia;

public class Operador {
    
    // tipos primitivos são passados como copias em parametros de metodos
    public void zerarInteiro(int valor){
        // valor é uma copia local da variavel passada como parametro
        System.out.println("zerarInteiro valor: " + valor);
        valor = 0;
        System.out.println("zerarInteiro valor: " + valor);
    }
    
    // tipos referencia sao passados literalmente em parametros de metodos
    public void zerarValorInteiro(ValorInteiro v){
        System.out.println("v.getValor(): " + v.getValor());
        v.setValor(0);
        System.out.println("v.getValor(): " + v.getValor());
    }
}
