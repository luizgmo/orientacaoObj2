package aulas.variavel.composta;

public class ArrayMultiD {
    public static void main(String[] args) {
        
        // int [][] b = new int [2][5]; // todas as linhas possuem 5 colunas
        int [][] b = new int [2][]; // quantidade de colunas podem ser criadas de maneira dinamica
        
        b[0] = new int[5];
        System.out.println(b[0][0]);
        System.out.println(b[0][1]);
        System.out.println(b[0][2]);
        System.out.println(b[0][3]);
        System.out.println(b[0][4]);
        
        b[1] = new int[3];
        System.out.println(b[1][0]);
        System.out.println(b[1][1]);
        System.out.println(b[1][2]);
        
        System.out.println("quantidade de linhas: " + b.length);
        System.out.println("comprimento linha 1: " + b[0].length);
        System.out.println("comprimento linha 2: " + b[1].length);
        
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + " \t ");
            }
            System.out.print("\n");
        }
        
        System.out.println("-----------");
        
        int[][][] mat3D = new int[4][6][3];
        
        mat3D[3][0][0] = 256;
        mat3D[2][5][1] = 1024;
        
        // profundidade da linha 0 coluna 0
        for (int k = 0; k < mat3D[0][0].length; k++){
            System.out.print("Camada K: " + k + "\n");
            for (int i = 0; i < mat3D.length; i++){
                for (int j = 0; j < mat3D[0].length; j++){
                    System.out.print(mat3D[i][j][k] + " \t ");
                }
                System.out.print("\n");
            }
            System.out.print("\n\n");
        }
    }
}
