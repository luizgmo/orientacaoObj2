package exercicios.lista2013.ex233;

public class Main {
    public static void main(String[] args) {
        RestauranteCaseiro restaurante = new RestauranteCaseiro(4);
        
        restaurante.adicionaAoPedido(0, "refeicao", 2);
        restaurante.adicionaAoPedido(0, "sobremesa", 2);
        restaurante.adicionaAoPedido(0, "refrigerante2l", 1);

        restaurante.adicionaAoPedido(1, "refeicao", 1);
        
        restaurante.adicionaAoPedido(2, "cerveja", 5);
        
        restaurante.adicionaAoPedido(3, "refeicao", 2);
        restaurante.adicionaAoPedido(3, "refrigerante600ml", 2);
        
        restaurante.exibeConta(0);
        restaurante.exibeConta(1);
        restaurante.exibeConta(2);
        restaurante.exibeConta(3);
        
        restaurante.zeraPedidos(0);
        restaurante.exibeConta(0);

    }
}
