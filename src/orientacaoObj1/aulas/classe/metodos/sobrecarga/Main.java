package aulas.classe.metodos.sobrecarga;

import aulas.classe.modificadores.estatico.CalculadorDePontos;

public class Main {
    public static void main(String[] args) {
        Ponto origem = new Ponto();
        
        Ponto p = new Ponto(5, 5);
        
        Ponto k = new Ponto("x", 3);
        
        Ponto o = new Ponto("y", -2);
        
        // sobrecarga do metodo setX
        p.setX();
        
        System.out.println(CalculadorDePontos.calcularDistanciaPontos(origem, k));
        
    }
}
