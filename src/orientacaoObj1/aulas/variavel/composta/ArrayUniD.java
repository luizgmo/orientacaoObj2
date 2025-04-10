package aulas.variavel.composta;

import java.util.Arrays;

public class ArrayUniD {
    public static void main(String[] args) {
        
        // int[] vetor = new int[5];
        
        int [] vetor;
        vetor = new int[5];
        vetor = new int[25]; // perde a alocaçao anterior
        
        final int TAMANHO = 5;
        vetor = new int[TAMANHO];
        
        vetor[0] = 5;
        vetor[1] = 3;
        vetor[2] = 1;
        vetor[3] = -2;
        vetor[4] = 10;
        
        System.out.println("vetor[0]: " + vetor[0]);
        
        System.out.println("Índice \t Valor");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] *= 2; // altera o valor do vetor
            System.out.println(i + " \t " + vetor[i]);
        }
        
        System.out.println("-------------");
        
        System.out.println("Valor");
        for (int v : vetor){
            v *= 2; // nao altera o valor do vetor, apenas imprime
            System.out.println(v);
        }
        
        System.out.println("Índice \t Valor");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(i + " \t " + vetor[i]);
        }
        
        System.out.println("-------------");
        
        System.out.println("OperadorArray.soma(vetor): " + OperadorArray.soma(vetor));
        
        OperadorArray.preencher(vetor, 1);
        System.out.println("OperadorArray.soma(vetor): " + OperadorArray.soma(vetor));
        
        Arrays.fill(vetor, 2);
        System.out.println("OperadorArray.soma(vetor): " + OperadorArray.soma(vetor));
        
        System.out.println("-------------");
        
        Ponto p = new Ponto(13, 13);
        System.out.println(p); // esta implicito a chamado do metodo toString()
        
        Ponto[] pontos = new Ponto[5];
        
        System.out.println("Ponto 1");
        System.out.println(pontos[1]);
        
        System.out.println("Ponto 3");
        pontos[3] = p; // p e pontos[3] apontam para o mesmo objeto (referencia) da classe Ponto
        System.out.println(pontos[3]);
        
        System.out.println("Ponto 3");
        pontos[3].setX(2);
        pontos[3].setY(2);
        System.out.println(pontos[3]);
        
        System.out.println("Ponto 2");
        pontos[2] = new Ponto(5, 5);
        System.out.println(pontos[2]);
        
        System.out.println("-------------");
        
        System.out.println("Índice \t Ponto");
        for (int i = 0; i < pontos.length; i++){
            System.out.println(i + " \t " + pontos[i]);
        }
        
        System.out.println("-------------");
        
        Arrays.fill(pontos, new Ponto(0, 0));
        System.out.println("Índice \t Ponto");
        for (int i = 0; i < pontos.length; i++){
            System.out.println(i + " \t " + pontos[i]);
        }
        
        System.out.println("-------------");
        
        pontos[1].setX(10);
        System.out.println("Índice \t Ponto");
        for (int i = 0; i < pontos.length; i++){
            System.out.println(i + " \t " + pontos[i]);
        }
        
        System.out.println("-------------");
        for (int i = 0; i < pontos.length; i++){
            pontos[i] = new Ponto(0, 0);
            System.out.println(i + " \t " + pontos[i]);
        }
    }
}
