package exercicios.lista2013.ex233;

public class MesaDeRestaurante {
    private double qntdRefeicao;
    private int qntdSobremesa;
    private int qntdRefrigerante2L;
    private int qntdRefrigerante600mL;
    private int qntdCerveja;
    
    private double PRECO_REFEICAO = 30;
    private double PRECO_SOBREMESA = 10;
    private double PRECO_REFRIGERANTE2L = 12;
    private double PRECO_REFRIGERANTE600ML = 6;
    private double PRECO_CERVEJA = 5;
    
    public void adicionaAoPedido(String item, int qntd){
        switch(item.toLowerCase()){
            case "refeicao":
                qntdRefeicao+= qntd;
                break;
            case "sobremesa":
                qntdSobremesa+= qntd;
                break;
            case "refrigerante2l":
                qntdRefrigerante2L+= qntd;
                break;
            case "refrigerante600ml":
                qntdRefrigerante600mL+= qntd;
                break;
            case "cerveja":
                qntdCerveja+= qntd;
                break;
            default:
                System.out.println("Esse item não existe.");
        }
    }
    
    public void zerarPedidos(){
        qntdRefeicao = 0;
        qntdSobremesa = 0;
        qntdRefrigerante2L = 0;
        qntdRefrigerante600mL = 0;
        qntdCerveja = 0;
    }
    
    public double calculaTotal(){
        double total = (qntdRefeicao * PRECO_REFEICAO) + (qntdSobremesa * PRECO_SOBREMESA) + (qntdRefrigerante2L * PRECO_REFRIGERANTE2L) + (qntdRefrigerante600mL * PRECO_REFRIGERANTE600ML) + (qntdCerveja * PRECO_CERVEJA);
        return total;
    }
}
