import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int idade, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
        double peso, soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;

        for (int i = 0; i < 15; i++){
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = console.nextInt();

            System.out.println("Digite o peso da pessoa " + (i + 1) + ": ");
            peso = console.nextDouble();

            if ((idade >= 1) && (idade <= 10)){
                contador1++;
                soma1 += peso;
            } else if ((idade >= 11) && (idade <= 20)){
                contador2++;
                soma2 += peso;
            } else if ((idade >= 21) && (idade <= 30)){
                contador3++;
                soma3 += peso;
            } else if (idade >= 31){
                contador4++;
                soma4 += peso;
            }

        }

        System.out.println("Média do peso das pessoas de 1-10 anos: " + (soma1)/contador1);
        System.out.println("Média do peso das pessoas de 11-20 anos: " + (soma2)/contador2);
        System.out.println("Média do peso das pessoas de 21-30 anos: " + (soma3)/contador3);
        System.out.println("Média do peso das pessoas de 31+ anos: " + (soma4)/contador4);



    }
}
