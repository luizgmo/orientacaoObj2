package exercicios.lista2013.ex1227;

public class Main {
    public static void main(String[] args) {
        MaquinaDeKaraoke maquina = new MaquinaDeKaraoke();

        maquina.adicionarMusica("Channel");
        maquina.adicionarMusica("Nights");
        maquina.adicionarMusica("Boredom");
        maquina.adicionarMusica("Moments");
        
        maquina.listarMusicas();

        System.out.println(maquina.executarMusica());
        System.out.println(maquina.executarMusica());

        maquina.listarMusicas();
        
        maquina.adianta("Moments");
        maquina.listarMusicas();
    }
}
