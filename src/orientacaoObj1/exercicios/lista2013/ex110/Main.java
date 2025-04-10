package exercicios.lista2013.ex110;

public class Main {
    public static void main(String[] args) {

        // hora inicial
        HoraAproximada hora = new HoraAproximada(00, 00);
        hora.mostrarHora();

        // hora inválida
        hora.setHora(25, 10);
        hora.mostrarHora();
        
        // hora válida
        hora.setHora(12, 41);
        hora.mostrarHora();
    }
}
