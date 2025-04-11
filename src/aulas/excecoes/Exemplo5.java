package aulas.excecoes;

public class Exemplo5 {
    public static void main(String[] args) {
        Data hoje = new Data();
        
        hoje.setDia(4);
        
        try{
            hoje.setMes(4);
            hoje.setAno(-1);
        } catch(NullPointerException ex1){
            System.out.println(ex1.getMessage());
        } catch(Exception ex2){
            System.out.println(ex2.getMessage());
        }
    }
}
