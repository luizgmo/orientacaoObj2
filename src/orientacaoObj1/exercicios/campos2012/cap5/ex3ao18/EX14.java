import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int idade, opiniao, contadorOtimo = 0, somaOtimo = 0, contadorRegular = 0, contadorBom = 0;
        double mediaOtimo;

        for (int i = 0; i < 3; i++){
            System.out.println("\nDigite a idade da pessoa " + (i + 1) + ": ");
            idade = console.nextInt();

            System.out.println("1 - Regular / 2 - Bom / 3 - Ótimo");
            System.out.println("Digite a opinião da pessoa " + (i + 1) + ": ");
            opiniao = console.nextInt();

            if (opiniao == 3){
                contadorOtimo++;
                somaOtimo += idade;
            } else if (opiniao == 1){
                contadorRegular++;
            } else if (opiniao == 2){
                contadorBom++;
            }


        }

        mediaOtimo = somaOtimo/contadorOtimo;

        System.out.println("A média da idade das pessoas que responderam ótimo é: " + mediaOtimo);
        System.out.println("Quantidade de pessoas que responderam regular: " + contadorRegular);
        System.out.println("Porcentagem de pessoas que responderam bom: " + (contadorBom * 100)/3 + "%");


    }
}
