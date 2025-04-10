package exercicios.lista2013.ex819;

public class LivroLivraria extends Livro{
    private double preco;
    private int estoque;
    
    public LivroLivraria(String nome, String autor, int paginas, double preco, int estoque) {
        super(nome, autor, paginas);
        setPreco(preco);
        setEstoque(estoque);
    }

    private double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    private int getEstoque() {
        return estoque;
    }

    private void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
    
}
