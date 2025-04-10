
package aulas.calendar;

import java.util.Calendar;

public class Data {
    int dia, mes, ano;
    
    public Data(){
        Calendar data = Calendar.getInstance();
            
        dia = data.get(Calendar.DAY_OF_MONTH);
        mes = data.get(Calendar.MONTH) + 1;
        ano = data.get(Calendar.YEAR);
    }
    
    public void mostrarData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }       
}
