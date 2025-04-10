package aulas.calendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        
        Calendar data = Calendar.getInstance(); // getInstance() vai retornar um objeto da classe Calendar
        
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int mes = data.get(Calendar.MONTH) + 1;
        int ano = data.get(Calendar.YEAR);
        
        System.out.println(dia + "/" + mes + "/" + ano);
        
        System.out.printf("%tc\n", data);
        System.out.printf("%tF\n", data);
        System.out.printf("%tA\n", data);
        
        System.out.println("###");
        
        Data dt = new Data();
        dt.mostrarData();
        
    }
}
