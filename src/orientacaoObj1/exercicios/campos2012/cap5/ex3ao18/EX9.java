import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int idade, contador2 = 0, contador190 = 0, contadorIdade = 0;
        double peso, altura, somapeso = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = console.nextInt();

            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            altura = console.nextDouble();

            System.out.println("Digite o peso da pessoa " + (i + 1) + ": ");
            peso = console.nextDouble();

            somapeso += peso;

            if ((peso > 90) && (altura < 1.5)){
                contador2++;
            }

            if (altura > 1.9){
                contador190++;
                if (idade >= 10 && idade <= 30){
                    contadorIdade++;
                }
            }

        }

        System.out.println("A média de peso é: " + (somapeso / 10));
        System.out.println("A quantidade de pessoas com mais de 90kg e menos que 1.5m é: " + contador2);
        System.out.println("A porcentagem de pessoas de 10 a 30 anos entre as pessoas com mais de 1.9m é: " + (contadorIdade * 100) / contador190 + "%");

    }
}
