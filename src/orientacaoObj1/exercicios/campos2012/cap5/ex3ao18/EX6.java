import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int codigo;
        double valor, totalV = 0, totalP = 0, prestacaoTotal = 0;

        for (int i = 0; i < 15; i++){
            System.out.println("Digite o código (V/P): ");
            codigo = console.next().charAt(0);

            System.out.println("Digite o valor da transação: ");
            valor = console.nextDouble();

            if (codigo == 'V'){
                totalV += valor;
            } else if (codigo == 'P'){
                totalP += valor;
                prestacaoTotal += (valor/3);
            }
        }
        System.out.println("Total de compras à vista: " + totalV);
        System.out.println("Total de compras a prazo: " + totalP);
        System.out.println("Total de compras: " + (totalV + totalP));
        System.out.println("Total da primeira prestação das compras a prazo juntas: " + prestacaoTotal);
    }
}
