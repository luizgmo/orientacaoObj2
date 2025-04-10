package exercicios.lista2013.ex224;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(22,10,2024);
        Data data2 = new Data(10,11,2023);
        data1.exibirData();
        data1.duplicaData(data2);
        data1.exibirData();
        data2.exibirData();
    }
}
