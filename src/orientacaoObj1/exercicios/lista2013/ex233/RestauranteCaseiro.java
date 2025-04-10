package exercicios.lista2013.ex233;

public class RestauranteCaseiro {
    private final MesaDeRestaurante[] mesas;
    
    public RestauranteCaseiro(int numeroMesas){
        mesas = new MesaDeRestaurante[numeroMesas];
        for (int i = 0; i < numeroMesas; i++){
            mesas[i] = new MesaDeRestaurante();
        }
    }
    
    public void adicionaAoPedido(int mesa, String item, int quantidade){
        if (mesa >= 0 && mesa < mesas.length){
            mesas[mesa].adicionaAoPedido(item, quantidade);
        } else{
            System.out.println("Mesa inválida.");
        }
    }
    
    public void exibeConta(int mesa){
        if (mesa >= 0 && mesa < mesas.length){
            System.out.println("Total da conta da Mesa " + mesa + ": R$" + mesas[mesa].calculaTotal());
        } else{
            System.out.println("Mesa inválida.");
        }
    }
    
    public void zeraPedidos(int mesa){
        if (mesa >= 0 && mesa < mesas.length){
            mesas[mesa].zerarPedidos();
        } else{
            System.out.println("Mesa inválida.");
        }
    }
}
