import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        double valorCarro, precoAVista, precoFinalComAcrescimo, valorParcela;

        int[] parcelas = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        double[] acrescimos = {0.03, 0.06, 0.09, 0.12, 0.15, 0.18, 0.21, 0.24, 0.27, 0.30};

        System.out.print("Digite o valor do carro: ");
        valorCarro = console.nextDouble();

        precoAVista = valorCarro * 0.80;
        System.out.printf("Preço final para compra à vista (20%% de desconto): R$ %.2f%n%n", precoAVista);

        System.out.println("Tabela de Parcelamento:");

        for (int i = 0; i < parcelas.length; i++) {
            precoFinalComAcrescimo = valorCarro * (1 + acrescimos[i]);

            valorParcela = precoFinalComAcrescimo / parcelas[i];

            System.out.printf("Parcelas: %d    | Valor Final: %f    | Valor Parcela: %f%n", parcelas[i], precoFinalComAcrescimo, valorParcela);
        }

    }
}
