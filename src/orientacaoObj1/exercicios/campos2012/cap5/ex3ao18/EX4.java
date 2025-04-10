import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        
        Scanner console;
        console = new Scanner(System.in);
        
        int numero;

        System.out.println("Digite um número: ");
        numero = console.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
