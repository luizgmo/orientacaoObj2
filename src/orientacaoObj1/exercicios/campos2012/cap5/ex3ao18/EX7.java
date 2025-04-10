import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int idade, contador50 = 0, contadorAltura = 0, contadorPeso = 0, contador = 5;
        double peso, altura, somaAltura = 0;

        for (int i = 0; i < contador; i++){
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = console.nextInt();

            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            altura = console.nextDouble();

            System.out.println("Digite o peso da pessoa " + (i + 1) + ": ");
            peso = console.nextDouble();



            if (idade > 50){
                contador50++;
            }
            if ((idade >= 10) && (idade <= 20)){
                contadorAltura++;
                somaAltura += altura;
            }
            if (peso < 40){
                contadorPeso++;
            }

        }

        System.out.println("A quantidade de pessoas com mais de 50 anos é: " + contador50);
        System.out.println("A média de altura das pessoas com idade entre 10 e 20 anos é: " + (somaAltura / contadorAltura));
        System.out.println("A porcentagem de pessoas com menos de 40kg é: " + ((contadorPeso * 100) / contador) + "%");

    }
}
