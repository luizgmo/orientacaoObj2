package exercicios.lista2013.ex1129;

public class CodigoMorse {
    private static char[] caracters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ','};
    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".-.-.-", "--..--"};

    public static String codificar(String texto){
        texto = texto.toLowerCase();
        String codigoMorse = "";
        
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            for (int j = 0; j < caracters.length; j++){
                if (c == caracters[j]){
                    codigoMorse += morse[j] + " ";
                    break;
                }
            }
        }
        return codigoMorse.trim();
    }
    
    public static String decodificar(String cMorse){
        String texto = "";
        String[] simbolos = cMorse.split(" ");
        
        for (int i = 0; i < simbolos.length; i++){
            String simbolo = simbolos[i];
            boolean encontrado = false;
            for (int j = 0; j < morse.length; j++){
                if (simbolo.equals(morse[j])){
                    texto += caracters[j];
                    encontrado = true;
                    break;
                }
            }
            
            if (!encontrado){
                texto += "?";
            }
        }
        return texto;
    }
    
    public static void main(String[] args) {
        String texto = "Farfalhar";
        String codigo = codificar(texto);
        System.out.println("Texto codificado: " + codigo);

        String textoDecodificado = decodificar(codigo);
        System.out.println("Texto decodificado: " + textoDecodificado);
        
        System.out.println(decodificar("----"));
    }
}
