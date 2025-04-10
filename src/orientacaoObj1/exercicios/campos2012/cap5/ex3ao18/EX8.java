import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int idade, contador1 = 0, contador150 = 0, soma150 = 0, contadorAzul = 0, contadorRA = 0;
        double peso, altura;
        char olho, cabelo;

        for (int i = 0; i < 6; i++){
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = console.nextInt();

            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            altura = console.nextDouble();

            System.out.println("Digite o peso da pessoa " + (i + 1) + ": ");
            peso = console.nextDouble();

            System.out.println("Digite a cor dos olhos (A/P/V/C) da pessoa " + (i + 1) + ": ");
            olho = console.next().charAt(0);

            System.out.println("Digite a cor do cabelo (P/C/L/R) da pessoa " + (i + 1) + ": ");
            cabelo = console.next().charAt(0);



            if ((idade > 50) && (peso < 60)){
                contador1++;
            }
            if (altura < 1.5){
                contador150++;
                soma150 += idade;
            }
            if (olho == 'A'){
                contadorAzul++;
            }
            if ((cabelo == 'R') && (olho != 'A')){
                contadorRA++;
            }


        }

        System.out.println("A quantidade de pessoas com mais de 50 anos e menos de 60kg é: " + contador1);
        System.out.println("A média da idade das pessoas com menos de 1,50m é: " + (soma150 / contador150));
        System.out.println("A porcentagem de pessoas com olhos azuis é: " + (contadorAzul * 100)/6 + "%");
        System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis é: " + contadorRA);
    }
}
