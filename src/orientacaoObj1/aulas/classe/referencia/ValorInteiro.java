package aulas.classe.referencia;

public class ValorInteiro {
    // campo encapsulado
    private int valor;
    
    public ValorInteiro(int v){
        setValor(v);
    }
    
    // dinamica de acesso ao valor do campo encapsulado
    public int getValor(){
        return valor;
    }
    
    // dinamica de alteraçao do campo encapsulado
    public void setValor(int v){
        valor = v;
    }
}
