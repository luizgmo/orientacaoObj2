package exercicios.lista2013.ex224;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void duplicaData(Data novaData){
        int novoDia = novaData.dia * 2;
        int novoMes = novaData.mes * 2;
        int novoAno = novaData.ano * 2;
        
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void exibirData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
