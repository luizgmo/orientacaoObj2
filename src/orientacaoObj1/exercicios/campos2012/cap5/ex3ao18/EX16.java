import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int idade, soma = 0, contador = 0;
        double media;

        do{
            System.out.println("Digite a idade (0 para sair): ");
            idade = console.nextInt();

            if (idade != 0){
                soma += idade;
                contador++;
            }
        } while (idade != 0);

        media = soma/contador;

        System.out.println("A média das idades é: " + media);

    }
}
