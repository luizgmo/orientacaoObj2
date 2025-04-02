package revisao;

public class Main {
    public static void main(String[] args) {
        LivroFisico l1 = new LivroFisico("L1", "Java Como Programar", "DEITEL & DEITEL", 8, 2008);
        
        Revista r1 = new Revista("R1", "TVCG", "IEEE", 1, 2024);
        
        l1.getAutores();
        
        Emprestavel[] biblioteca = new Emprestavel[5];
        
        biblioteca[0] = l1;
        biblioteca[1] = r1;
        
    }
}
