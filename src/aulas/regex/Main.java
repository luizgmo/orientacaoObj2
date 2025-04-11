package aulas.regex;

public class Main {

    public static void main(String[] args) {
        String str;
        String regex;

        str = "a";
        regex = "a";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "aa";
        regex = "a";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "a";
        regex = "[a-z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "B";
        regex = "[a-zA-Z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Bb";
        regex = "[a-zA-Z]";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Bb";
        regex = "[a-zA-Z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "BbY";
        regex = "[a-zA-Z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "";
        regex = "[a-zA-Z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "";
        regex = "[a-zA-Z]*";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Y";
        regex = "\\w";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "A253454";
        regex = "A\\d+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "Luiz Gustavo";
        regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "12345-321";
        regex = "\\d{5}-\\d{3}";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "+55(14)99672-7380";
        regex = "(\\+\\d{1,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "sadjka ffasf";
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
        
        str = "sadjka ffasf";
        String[] vetor = str.split("\\s+");
        
        for(String s : vetor){
            System.out.println(s);
        }
    }

}
