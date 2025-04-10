package exercicios.lista2013.ex1120;

public class StringDNA {
    private String dna;

    public StringDNA(String dna) {
        String dnaValido = "";
        for (int i = 0; i < dna.length(); i++){
            char c = dna.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T'){
                dnaValido += c;
            }
        }
        this.dna = dnaValido;
    }
    
    public char charAt(int i){
        if (i < 0 || i >= dna.length()){
            return 'X';
        }
        return dna.charAt(i);
    }
    
    public int quantosA(){
        return contarCaracter('A');
    }
    
    public int quantosC(){
        return contarCaracter('C');
    }
    
    public int quantosG(){
        return contarCaracter('G');
    }
    
    public int quantosT(){
        return contarCaracter('T');
    }
    
    private int contarCaracter(char c){
        int cont = 0;
        for (int i = 0; i < dna.length(); i++){
            if (dna.charAt(i) == c){
                cont++;
            }
        }
        return cont;
    }
    
    public int length(){
        return dna.length();
    }
    
    @Override
    public String toString() {
        return dna;
    }
 
    
    public static void main(String[] args) {
        StringDNA dna1 = new StringDNA("CAATGCCT");
        System.out.println(dna1);
        System.out.println(dna1.charAt(0));
        System.out.println(dna1.charAt(2));
        System.out.println(dna1.quantosA());
        System.out.println(dna1.quantosC());
        System.out.println(dna1.quantosG());
        System.out.println(dna1.quantosT());
        System.out.println(dna1.length());
        
        System.out.println("---------------");
        
        StringDNA dna2 = new StringDNA("JAVA");
        System.out.println(dna2);
    }
}
