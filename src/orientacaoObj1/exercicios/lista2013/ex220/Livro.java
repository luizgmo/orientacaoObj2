package exercicios.lista2013.ex220;

public class Livro {
    private String nome;
    private String autor;
    private int ano;
    
    public Livro(String nome, String autor, int ano){
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void exibirLivro(){
        System.out.println("Titulo: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
    }
}
