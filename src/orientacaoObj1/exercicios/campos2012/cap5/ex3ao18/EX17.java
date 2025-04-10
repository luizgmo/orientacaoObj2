import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int canal, pessoas, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0, total = 0;

        do{
            System.out.println("Digite o número do canal (4 / 5 / 7 / 12 / 0 - sair ): ");
            canal = console.nextInt();
            if (canal == 0){
                break;
            }

            System.out.println("Digite o número de pessoas assistindo: ");
            pessoas = console.nextInt();

            switch(canal){
                case 4:
                    canal4 += pessoas;
                    total += pessoas;
                    break;
                case 5:
                    canal5 += pessoas;
                    total += pessoas;
                    break;
                case 7:
                    canal7 += pessoas;
                    total += pessoas;
                    break;
                case 12:
                    canal12 += pessoas;
                    total += pessoas;
                    break;

            }

        } while (canal != 0);

        System.out.println("Audiência canal 4: " + (canal4 * 100)/total + "%");
        System.out.println("Audiência canal 5: " + (canal5 * 100)/total + "%");
        System.out.println("Audiência canal 7: " + (canal7 * 100)/total + "%");
        System.out.println("Audiência canal 12: " + (canal12 * 100)/total + "%");

    }
}
