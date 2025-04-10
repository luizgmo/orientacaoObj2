package exercicios.moraes2013.ex1cap6;

public class Automovel extends Veiculo{
    @Override
    public void listarVerificacoes() {
        System.out.println("Listando verificações do automóvel.");
    }
    
    @Override
    public void ajustar() {
        System.out.println("Ajustando o automóvel.");
    }
    
    @Override
    public void limpar() {
        System.out.println("Limpando o automóvel.");
    }
    
    public void mudarOleo() {
        System.out.println("Mudando o óleo do automóvel.");
    }
}
