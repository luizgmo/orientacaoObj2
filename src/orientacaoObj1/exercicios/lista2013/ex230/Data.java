package exercicios.lista2013.ex230;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        if (dataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else{
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
    }
    
    private boolean dataValida(int dia, int mes, int ano){
        if (mes < 1 || mes > 12){
            return false;
        }
        
        int diasMax;
        switch(mes){
            case 4: case 6: case 9: case 11:
                diasMax = 30;
                break;
            case 2:
                if (bissexto(ano)){
                    diasMax = 29;
                } else{
                    diasMax = 28;
                }
                break;
            default:
                diasMax = 31;
        }
        
        return dia >= 1 && dia <= diasMax;
    }
    
    private boolean bissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
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
