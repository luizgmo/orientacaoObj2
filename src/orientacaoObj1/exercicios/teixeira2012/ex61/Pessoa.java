package exercicios.teixeira2012.ex61;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
