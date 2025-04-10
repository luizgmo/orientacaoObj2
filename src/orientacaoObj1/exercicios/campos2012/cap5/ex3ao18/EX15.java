import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int contadorSim = 0, contadorNao = 0, contadorFS = 0, contadorM = 0, contadorMN = 0;
        char sexo, resposta;

        for (int i = 0; i < 10; i++){
            System.out.println("\nDigite o sexo (M/F) da pessoa " + (i + 1) + ": ");
            sexo = console.next().charAt(0);

            System.out.println("Digite a resposta (S/N) da pessoa " + (i + 1) + ": ");
            resposta = console.next().charAt(0);

            if (resposta == 'S'){
                contadorSim++;
            } else if (resposta == 'N'){
                contadorNao++;
            }

            if ((sexo == 'F') && (resposta == 'S')){
                contadorFS++;
            }

            if (sexo == 'M'){
                contadorM++;
            }

            if ((sexo == 'M') && (resposta == 'N')){
                contadorMN++;
            }


        }

        System.out.println("Pessoas que responderam SIM: " + contadorSim);
        System.out.println("Pessoas que responderam NAO: " + contadorNao);
        System.out.println("Mulheres que responderam SIM: " + contadorFS);
        System.out.println("Homens que responderam NAO entre todos os homens: " + (contadorMN * 100)/contadorM + "%");

    }
}
