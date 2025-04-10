package exercicios.lista2013.ex1227;

import java.util.ArrayList;

public class MaquinaDeKaraoke {
    private ArrayList<String> filaDeMusicas;

    public MaquinaDeKaraoke() {
        filaDeMusicas = new ArrayList<>();
    }

    public void adicionarMusica(String titulo) {
        filaDeMusicas.add(titulo);
    }

    public void listarMusicas() {
        if (filaDeMusicas.isEmpty()) {
            System.out.println("A fila de músicas está vazia.");
            return;
        }
        
        System.out.println("Fila de músicas:");
        for (String musica : filaDeMusicas) {
            System.out.println("- " + musica);
        }
    }

    public String executarMusica() {
        if (filaDeMusicas.isEmpty()) {
            return "Não há músicas na fila para executar.";
        }
        
        String musicaExecutada = filaDeMusicas.get(0);
        filaDeMusicas.remove(0);
        return "Executando: " + musicaExecutada;
    }
    
    public void adianta(String titulo) {
        int index = filaDeMusicas.indexOf(titulo);

        if (index > 0) {
            String musica = filaDeMusicas.remove(index);
            filaDeMusicas.add(index - 1, musica);
        }
    }

    public void adia(String titulo) {
        int index = filaDeMusicas.indexOf(titulo);

        if (index >= 0 && index < filaDeMusicas.size() - 1) {
            String musica = filaDeMusicas.remove(index);
            filaDeMusicas.add(index + 1, musica);
        }
    }
}

