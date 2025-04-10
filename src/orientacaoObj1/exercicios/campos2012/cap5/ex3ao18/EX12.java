import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int numero, contadorprimo = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            numero = console.nextInt();


            boolean primo = true;
            if (numero < 2) {
                primo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numero); j++) {
                    if (numero % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                contadorprimo++;
            }

        }

        System.out.println("Quantidade de números primos: " + contadorprimo);

    }
}
