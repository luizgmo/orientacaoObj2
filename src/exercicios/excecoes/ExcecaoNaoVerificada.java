package exercicios.excecoes;

import aulas.excecoes.*;

public class ExcecaoNaoVerificada extends RuntimeException{

    public ExcecaoNaoVerificada(String mensagem) {
        super(mensagem);
    }
    
}
