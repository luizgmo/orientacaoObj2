package exercicios.lista2013.ex819;

public class LivroBiblioteca extends Livro{
    private boolean emprestado;
    private String nomeLeitor;

    public LivroBiblioteca(String nome, String autor, int paginas, boolean e, String n) {
        super(nome, autor, paginas);
        setEmprestado(e);
        setNomeLeitor(n);
    }

    private boolean isEmprestado() {
        return emprestado;
    }

    private void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    private String getNomeLeitor() {
        return nomeLeitor;
    }

    private void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }
    
    
}
