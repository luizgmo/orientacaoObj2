package aulas.classe.encapsulamento;


public class Main {
    public static void main(String[] args) {

        Pessoa usuario = new Pessoa(1.8, 'M');
        
        // variavel local do tipo primitivo (double)
        /*double aux1 = usuario.obterAltura();
        System.out.println(aux1);
        
        char aux2 = usuario.obterSexo();
        System.out.println(aux2);
        
        char aux3 = usuario.obterPesoIdeal();
        System.out.println(aux3);*/
        
        System.out.println("\nInício");
        System.out.println("Altura: " + usuario.getAltura());
        System.out.println("Sexo: " + usuario.getSexo());
        System.out.println("Peso Ideal: " + usuario.getPesoIdeal());
        
        usuario.setAltura(usuario.getAltura() * 1.05);
        System.out.println("\nAlteração altura");
        System.out.println("Altura: " + usuario.getAltura());
        System.out.println("Sexo: " + usuario.getSexo());
        System.out.println("Peso Ideal: " + usuario.getPesoIdeal());
        
        usuario.setSexo('F');
        System.out.println("\nAlteração sexo");
        System.out.println("Altura: " + usuario.getAltura());
        System.out.println("Sexo: " + usuario.getSexo());
        System.out.println("Peso Ideal: " + usuario.getPesoIdeal());
        
    }
}
