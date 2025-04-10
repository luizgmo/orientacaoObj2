package aulas.polimorfismo.abstract_;

public class Main {
    public static void main(String[] args) {
        Assalariado emp1 = new Assalariado("Joao", "123.456.789-10", 4000);
        
        System.out.println(emp1.proventoSemanal());
        System.out.println(emp1.getSalario());
        System.out.println(emp1);
        
        System.out.println("");
        
        // variavel de superclasse pode receber referencia de objeto de subclasse
        Empregado emp2 = new Assalariado("Lucas", "123.456.789-10", 8000);
        
        System.out.println(emp2.proventoSemanal());
        // a variavel de superclasse so tem acesso aos recursos definidos superclasse
        // System.out.println(emp2.getSalario());
        System.out.println(emp2);
        
        Assalariado ass1;
        
        ass1 = (Assalariado) emp2;
        // definido na superclasse
        System.out.println(ass1.getNome());
        // definido na subclasse
        System.out.println(ass1.getSalario());
        
        System.out.println("----------------");
        
        Empregado emp3 = new Horista("Carlos", "564.178.674-98", 30, 12);
        Empregado emp4 = new Comissionado("Ana", "516.231.981-21", 10000, 15);
        Empregado emp5 = new ComissionadoAssalariado("Maria", "123.879.213-54", 10000, 15, 4000);
        
        Empregado[] folhaSalarial = new Empregado [100];
        
        folhaSalarial[0] = emp1;
        folhaSalarial[20] = emp2;
        folhaSalarial[21] = emp3;
        folhaSalarial[25] = emp4;
        folhaSalarial[30] = emp5;
        
        System.out.println("Processamento de Folha Salarial Semanal");
        System.out.println("Nome \t\tProventos");
        for (int i = 0; i < folhaSalarial.length; i++) {
            if (folhaSalarial[i] instanceof ComissionadoAssalariado){
                ComissionadoAssalariado aux;
                aux = (ComissionadoAssalariado) folhaSalarial[i];
                
                aux.setSalario(aux.getSalario() * 1.1);
            }
            
            if (folhaSalarial[i] != null){
                System.out.println(folhaSalarial[i].getNome() + "\t\t" + folhaSalarial[i].proventoSemanal());
            }
        }
        
        System.out.println("---------");
        
        Empregado emp6 = new Horista("Joao", "123.456.789-10", 25, 10);
        
        System.out.println(emp1);
        System.out.println(emp6);
        System.out.println(emp1.equals(emp6));
    }
}
