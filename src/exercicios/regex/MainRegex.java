package exercicios.regex;

public class MainRegex {
    public static void main(String[] args) {
        String str;
        String regex;

        System.out.println("--- Exercicio 4 ---");
        str = "Casa";
        regex = "[A-Z][a-z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "CASA";
        regex = "[A-Z][a-z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        System.out.println("--- Exercicio 26 ---");
        str = "1A3F";
        regex = "[0-9A-Fa-f]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "1A3G";
        regex = "[0-9A-Fa-f]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        System.out.println("--- Exercicio 29 ---");
        str = "2+2";
        regex = "\\d+\\s*[+\\-*/]\\s*\\d+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "2++2";
        regex = "\\d+\\s*[+\\-*/]\\s*\\d+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
    }
}
