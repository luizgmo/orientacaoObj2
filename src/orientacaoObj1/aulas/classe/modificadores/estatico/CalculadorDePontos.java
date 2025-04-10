package aulas.classe.modificadores.estatico;

import aulas.classe.metodos.sobrecarga.Ponto;

public class CalculadorDePontos {
    
    private CalculadorDePontos(){}
    
    public static double calcularDistanciaPontos(Ponto a, Ponto b){
        double resultado;
        
        resultado = Math.sqrt(Math.pow( (a.getX() - b.getX() ), 2) + Math.pow((a.getY() - b.getY()), 2));
        
        return resultado;
    }
}
