package exercicios.lista2013.ex1012;

public class Tabuada {
    public static void main(String[] args) {
        int [][][][][] tabuada = new int [10][10][10][10][10];
        
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    for (int l = 0; l < 10; l++){
                        for (int m = 0; m < 10; m++){
                            tabuada[i][j][k][l][m] = i * j * k * l * m;
                        }
                    }
                }
            }
        }
        
        System.out.println("Valor de tabuada[6][5][2][1][4]: " + tabuada[6][5][2][1][4]);
    }
}
