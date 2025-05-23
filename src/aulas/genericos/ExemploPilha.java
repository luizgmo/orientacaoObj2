package aulas.genericos;

import aulas.colecoes.Pessoa;

public class ExemploPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilhaInt = new Pilha<>();
        
        pilhaInt.adicionar(13);
        pilhaInt.adicionar(55);
        pilhaInt.adicionar(102);
        
        System.out.println(pilhaInt);
        System.out.println(pilhaInt.remover());
        System.out.println(pilhaInt);
        
        System.out.println("-----");
        
        Pessoa p1 = new Pessoa("Joao", 23);
        Pessoa p2 = new Pessoa("Maria", 32);
        Pessoa p3 = new Pessoa("Carlos", 18);
        
        Pilha pilhaO = new Pilha();
        
        pilhaO.adicionar(p1);
        pilhaO.adicionar(p2);
        pilhaO.adicionar(p3);
        
        System.out.println(pilhaO);
        System.out.println(pilhaO.remover() instanceof Object);
        
        Pessoa aux = (Pessoa) pilhaO.remover();
        
        System.out.println("-----");
        
        Pilha<Pessoa> pilhaP = new Pilha();
        
        pilhaP.adicionar(p1);
        pilhaP.adicionar(p2);
        pilhaP.adicionar(p3);
        
        System.out.println(pilhaP);
        System.out.println(pilhaP.remover().getIdade());
        
    }
}
