package aulas.string;

public class Main {
    public static void main(String[] args) {
        
        String str1 = "hello";
        String str0 = str1;
        String str2 = new String("hello");
        String str3 = "HELLO";
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2); // retorna se o objeto é igual ou nao
        System.out.println(str1 == str0); // retorna se o objeto é igual ou nao
        System.out.println(str1.equals(str2)); // retorna se o conteudo é igual ou nao
        System.out.println(str1.equals(str3)); // retorna se o conteudo é igual ou nao
        System.out.println(str1.equalsIgnoreCase(str2)); // retorna se o conteudo é igual ou nao ignorando se é maiusculo ou minusculo
        System.out.println(str1.equalsIgnoreCase(str3)); // retorna se o conteudo é igual ou nao ignorando se é maiusculo ou minusculo
        
        System.out.println("####");
        
        String str4 = "Instituto Federal de São Paulo (IFSP)";
        
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println(str4.charAt(13));
        
        for (int i = 0; i < str4.length(); i++){
            System.out.println(str4.charAt(i));
        }
        
        String str5 = str4.toLowerCase();
        System.out.println(str5);
        
        System.out.println("####");
        
        System.out.println(str4);
        System.out.println(str4.startsWith("Inst"));
        System.out.println(str4.startsWith("Luiz"));
        System.out.println(str4.endsWith(".txt"));
        
        System.out.println("####");
        
        String str6 = "    Luiz Gustavo";
        System.out.println(str6);
        String str7 = str6.trim();
        System.out.println(str7);
        
        System.out.println("####");
        
        double n = 3.14;
        String str8 = String.valueOf(n);
        System.out.println(str8);
        
        String str9 = "3.00";
        double k = Double.valueOf(str9);
        
        System.out.println(n - k);
        
    }
}
