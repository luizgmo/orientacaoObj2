package aulas.excecoes;

public class Exemplo5 {
    public static void main(String[] args) {
        Data hoje = new Data();
        
        hoje.setDia(4);
        
        try{
            hoje.setMes(0);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
