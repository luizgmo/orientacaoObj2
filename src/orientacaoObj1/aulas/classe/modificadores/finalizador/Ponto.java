package aulas.classe.modificadores.finalizador;

public class Ponto {
    
    // chamado na construcao do objeto - JVM aloca memoria
    public Ponto(){
        
    }
    
    // chamado quando a JVM libera espaços de memoria alocados mas nao referenciados
    public void finalize(){   
    }
}
