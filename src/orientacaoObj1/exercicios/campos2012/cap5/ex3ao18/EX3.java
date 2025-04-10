import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        
        Scanner console;
        console = new Scanner(System.in);
        
        int idade, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;

        for(int i = 0; i < 8; i++){
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = console.nextInt();
            if (idade <= 15){
                contador1++;
            } else if (idade >= 16 && idade <= 30){
                contador2++;
            } else if (idade >= 31 && idade <= 45){
                contador3++;
            } else if (idade >= 46 && idade <= 60){
                contador4++;
            } else{
                contador5++;
            }
        }
        System.out.println("Quantidade de pessoas com até 15 anos: " + contador1);
        System.out.println("Quantidade de pessoas de 16 até 30 anos: " + contador2);
        System.out.println("Quantidade de pessoas de 31 até 45 anos: " + contador3);
        System.out.println("Quantidade de pessoas de 45 até 60 anos: " + contador4);
        System.out.println("Quantidade de pessoas acima de 60 anos: " + contador5);
        System.out.println("A porcentagem de pessoas com até 15 anos é: " + (contador1 * 100 / 8) + "%");
        System.out.println("A porcentagem de pessoas acima de 60 anos é: " + (contador5 * 100 / 8) + "%");
    }
}
