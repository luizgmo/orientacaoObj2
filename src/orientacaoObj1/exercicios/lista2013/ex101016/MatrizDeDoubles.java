package exercicios.lista2013.ex101016;

public class MatrizDeDoubles {
    private int linhas;
    private int colunas;
    private double[][] matriz;


    public MatrizDeDoubles(int colunas, int linhas) {
        this.colunas = colunas; this.linhas = linhas;
        matriz = new double[linhas][colunas];
        preencheMatriz(0);
    }

    public void preencheMatriz(double valor) {
        for (int lin = 0; lin < linhas; lin++) {
            for (int col = 0; col < colunas; col++) {
                matriz[lin][col] = valor;
            }
        }
    }

    public double maiorValor() {
        double maiorAteAgora = matriz[0][0];
        for (int lin = 0; lin < linhas; lin++) {
            for (int col = 0; col < colunas; col++) {
                if (matriz[lin][col] > maiorAteAgora) {
                    maiorAteAgora = matriz[lin][col];
                }
            }
        }
        return maiorAteAgora;
    } 
    
    public double getValor(int linha, int coluna) {
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            return matriz[linha][coluna];
        }
        return Double.NaN;
    }

    public void setValor(int linha, int coluna, double valor) {
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            matriz[linha][coluna] = valor;
        }
    }
    
    public boolean eIgual(MatrizDeDoubles outraMatriz){
        if (this.matriz.length != outraMatriz.matriz.length || this.matriz[0].length != outraMatriz.matriz[0].length) {
            return false;
        }
        
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                if (this.matriz[i][j] != outraMatriz.matriz[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
