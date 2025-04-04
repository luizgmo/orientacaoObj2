package revisao;

public class Main {
    public static void main(String[] args) {
        LivroFisico l1 = new LivroFisico("L1", "Java Como Programar", "DEITEL & DEITEL", 8, 2008);
        
        Revista r1 = new Revista("R1", "TVCG", "IEEE", 1, 2024);
        
        l1.getAutores();
        
        Chave c1 = new Chave("A123");
        
        Emprestavel[] biblioteca = new Emprestavel[5];
        
        biblioteca[0] = l1;
        biblioteca[1] = r1;
        biblioteca[2] = c1;
        
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        biblioteca[0].devolver();
        
        System.out.println(biblioteca[0].podeEmprestar());
        
        System.out.println("Objetos disponíveis para empréstimo");
        for (int i = 0; i < biblioteca.length; i++){
            if (biblioteca[i] != null && biblioteca[i].podeEmprestar()){
                System.out.println(biblioteca[i].getNomeObjeto());
            }
        }
        
    }
}
