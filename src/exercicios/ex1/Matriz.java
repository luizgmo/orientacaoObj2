package exercicios.ex1;

public class Matriz {
    private double [][] matriz;
    private int tamanho;

    public Matriz(int tamanho, double valorInicial) {
        setTamanho(tamanho);
        this.matriz = new double[tamanho][tamanho];
        inicializarMatriz(valorInicial);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        if (tamanho == 2 || tamanho == 3){
            this.tamanho = tamanho;
        }
    }

    public Matriz(int tamanho) {
        this(tamanho, 0.0);
    }
    
    private void inicializarMatriz(double valor){
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                matriz[i][j] = valor;
            }
        }
    }
    
    public double getElemento(int linha, int coluna){
        if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho){
            System.out.println("Índice inválido");
            return 0;
        }
        return matriz[linha][coluna];
    }
    
    public void setElemento(int linha, int coluna, double valor){
        if (linha < 0 || linha >= tamanho || coluna < 0 || coluna >= tamanho){
            System.out.println("Índice inválido");
            return;
        }
        matriz[linha][coluna] = valor;
    }
    
    public void adicionar(double valor){
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                matriz[i][j] += valor;
            }
        }
    }
    
    public void subtrair(double valor){
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                matriz[i][j] -= valor;
            }
        }
    }
    
    public void dividir(double valor){
        if (valor == 0){
            System.out.println("Divisão por 0");
            return;
        }
        
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                matriz[i][j] /= valor;
            }
        }
    }
    
    public void multiplicar(double valor){
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                matriz[i][j] *= valor;
            }
        }
    }
    
    public double encontrarMaior(){
        double maior = matriz[0][0];
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                if (matriz [i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
    
    public double encontrarMenor(){
        double menor = matriz[0][0];
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                if (matriz [i][j] < menor){
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }
    
    public double calcularDeterminante(){
        if (tamanho == 2){
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else if (tamanho == 3){
            return (matriz[0][0] * matriz[1][1] * matriz[2][2]) +
                   (matriz[0][1] * matriz[2][2] * matriz[1][0]) +
                   (matriz[0][2] * matriz[1][0] * matriz[2][1]) -
                   (matriz[0][0] * matriz[2][2] * matriz[1][1]) -
                   (matriz[0][1] * matriz[1][0] * matriz[2][2]) -
                   (matriz[0][2] * matriz[1][1] * matriz[2][0]);
        }
        return 0;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                resultado += matriz[i][j] + " ";
            }
            resultado += "\n";
        }
        return resultado;
    }
    
    
}
