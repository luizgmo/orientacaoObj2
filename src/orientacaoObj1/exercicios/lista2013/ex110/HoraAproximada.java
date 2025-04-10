package exercicios.lista2013.ex110;

public class HoraAproximada {

    private int horas;
    private int minutos;

    // inicializar as horas e minutos
    public HoraAproximada(int h, int m) {
        if (horaValida(h, m)) {
            horas = h;
            minutos = m;
        } else {
            horas = 0;
            minutos = 0;
        }
    }
    
    // verificar se a hora é válida
    private boolean horaValida(int h, int m) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60);
    }

    // exibir a hora
    public void mostrarHora() {
        System.out.printf("%02d:%02d\n", horas, minutos);
    }

    // acessar as horas
    public int getHoras() {
        return horas;
    }

    // acessar os minutos
    public int getMinutos() {
        return minutos;
    }

    // redefinir a hora
    public void setHora(int h, int m) {
        if (horaValida(h, m)) {
            horas = h;
            minutos = m;
        } else {
            System.out.println("Hora inválida!");
        }
    }
}
