package exercicios.lista2013.ex819;

public class Livro {
    private String nome;
    private String autor;
    private int paginas;

    public Livro(String nome, String autor, int paginas) {
        setNome(nome);
        setAutor(autor);
        setPaginas(paginas);
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getPaginas() {
        return paginas;
    }

    private void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
}
