package aulas.classe.basico;


public class Main {
    public static void main(String[] args) {
        
        // usuario é uma variavel de referencia a um objeto do tipo Pessoa(classe)
        Pessoa usuario;
        // criaçao (new) do objeto do tipo Pessoa
        // criaçao de uma instancia da classe Pessoa
        usuario = new Pessoa(1.80, 'M');
        
        Pessoa cliente;
        cliente = new Pessoa(1.62, 'F');
        
        // acesso direto aos atributos do objeto presente em usuario
        // print dos valores iniciais
        System.out.println(usuario.altura);
        System.out.println(usuario.sexo);
        // pesoIdeal é uma variavel de instancia
        System.out.println(usuario.pesoIdeal);
        
        // acesso direto aos atributos do objeto presente em cliente
        // print dos valores iniciais
        System.out.println(cliente.altura);
        System.out.println(cliente.sexo);
        // pesoIdeal é uma variavel de instancia
        System.out.println(cliente.pesoIdeal);
        
        usuario.altura = 1.90;
        usuario.sexo = 'M';
        
        cliente.altura = 1.82;
        cliente.sexo = 'F';
        
        // executa o metodo calcularPesoIdeal do objeto presente em usuario
        usuario.calcularPesoIdeal();
        
        System.out.println(usuario.pesoIdeal);
        System.out.println(usuario.altura);
        System.out.println(usuario.sexo);
        
        cliente.calcularPesoIdeal();
        System.out.println(cliente.altura);
        System.out.println(cliente.sexo);
        System.out.println(cliente.pesoIdeal);
        
        // erro lógico, na maioria das vezes os atributos de uma classe, logo as variaveis de instancia deverao ser encapsuladas (ocultas para manter a integridade e segurança do objeto)
        cliente.pesoIdeal = -1.0;
        System.out.println(cliente.pesoIdeal);
        
    }
}