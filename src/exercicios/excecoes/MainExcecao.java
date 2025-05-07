package exercicios.excecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExcecao {
    public static void main(String[] args) {
        
        System.out.println("--- Exercicio 2 ---");
        VerificadorPar verificador = new VerificadorPar();

        int[] numeros = {2, 3, 4, 5};

        for (int n : numeros) {
            try {
                verificador.verificarPar(n);
            } catch (Exception e) {
                System.out.println("Exceção: " + e.getMessage());
            }
        }
        
        System.out.println("--- Exercicio 6 ---");
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Digite números inteiros separados por espaço:");
        String linha = scanner.nextLine();
        String[] partes = linha.trim().split("\\s+");

        try {
            for (String parte : partes) {
                lista.add(Integer.parseInt(parte));
            }
            VerificadorDuplicados verificadorDuplicados = new VerificadorDuplicados();
            verificadorDuplicados.verificarDuplicados(lista);
            System.out.println("Nenhum número duplicado encontrado!");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.");
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }
        
        System.out.println("--- Exercicio 7 ---");
        System.out.println("Digite uma string para verificar se contém vogais:");
        String entrada = scanner.nextLine();

        VerificadorVogais verificadorVogais = new VerificadorVogais();
        try {
            verificadorVogais.verificarVogais(entrada);
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}
