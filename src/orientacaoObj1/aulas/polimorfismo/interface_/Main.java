package aulas.polimorfismo.interface_;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Empregado emp1 = new Assalariado("luiz", "123.456.789-12", 20000);
        Empregado emp2 = new Assalariado("pedro", "123.456.789-12", 16000);
        
        Boleto b1 = new Boleto("SAEB", 250);
        Boleto b2 = new Boleto("CPFL", 1150);
        
        ArrayList<Pagavel> obrigacoes = new ArrayList<>();
        
        obrigacoes.add(emp1);
        obrigacoes.add(emp2);
        obrigacoes.add(b1);
        obrigacoes.add(b2);

        System.out.println("Processamento de Caixa - Semanal");
        double valorTotal = 0;
        
        for(int i = 0; i < obrigacoes.size(); i++){
            System.out.println(obrigacoes.get(i).getDescricao() + " ----- " + obrigacoes.get(i).getValor());
            valorTotal += obrigacoes.get(i).getValor();
        }
        
        System.out.println("Valor Total: " + valorTotal);
    }
}
