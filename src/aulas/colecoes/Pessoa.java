package aulas.colecoes;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        } else{
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        } else{
            throw new IllegalArgumentException("A idade não pode ser menor que 0");
        }
    }

    @Override
    public String toString() { // herdado da classe Object
        return getNome() + " (" + getIdade() + ")";
    }
    
    @Override
    public int compareTo(Pessoa p){ // herdado da interface Comparable
        if (getIdade() == p.getIdade()){
            return 0;
        } else{
            if(getIdade() > p.getIdade()){
                return 1;
            } else{
                return -1;
            }
        }
    }
}
