package exercicios.moraes2013.ex1cap6;

public class Bicicleta extends Veiculo{
    @Override
    public void listarVerificacoes() {
        System.out.println("Listando verificações da bicicleta.");
    }
    
    @Override
    public void ajustar() {
        System.out.println("Ajustando a bicicleta.");
    }
    
    @Override
    public void limpar() {
        System.out.println("Limpando a bicicleta.");
    }
}
