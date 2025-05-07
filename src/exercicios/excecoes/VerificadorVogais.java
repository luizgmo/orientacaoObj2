package exercicios.excecoes;

public class VerificadorVogais {
    public void verificarVogais(String texto) throws Exception {
        if (texto == null || !texto.toLowerCase().matches(".*[aeiou].*")) {
            throw new Exception("A string não contém vogais!");
        }
        System.out.println("A string contém pelo menos uma vogal.");
    }
}
