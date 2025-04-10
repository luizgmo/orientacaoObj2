import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int numero, somapar = 0, somaprimo = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            numero = console.nextInt();

            if (numero % 2 == 0){
                somapar += numero;
            }

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
                somaprimo += numero;
            }

        }

        System.out.println("Soma dos números pares: " + somapar);
        System.out.println("Soma dos números primos: " + somaprimo);

    }
}
