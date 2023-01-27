package coreJava.stringClass;

public class StringMethods3 {

    public static void main(String[] args) {

        //isEmpty(): checks if the string length is zero. return type --> boolean
        String str1 = "  ";
        System.out.println("str1 = " + str1);
        boolean r1 = str1.isEmpty();
        System.out.println("str1 is empty = " + r1);

        System.out.println("=========================================================================");
        //isBlank(): checks if the string is blank (no characters including space). return typ --> boolean
        String str2 = "  ";
        System.out.println("str2 = " + str2);
        boolean r2 = str2.isBlank();
        System.out.println("str2 isBlank() = " + r2);

        System.out.println("=========================================================================");

        //equals(String1): compares the content of two String1 objects. return type --> boolean.
        String word1 = "Java";
        System.out.println("word1 = " + word1);

        String word2 = new String("java");
        System.out.println("word2 = " + word2);

        boolean result2 = word1.equals(word2);
        System.out.println("result2 whether word1 and word2 are equal = " + result2);// false because of case sensitivity

        System.out.println("=========================================================================");

        //equalsIgnoreCase(String1): compares the content of two String1 objects regardless of case sensitivity.
        // return type --> boolean.

        String language1 = "Java";
        System.out.println("language1 = " + language1);

        String language2 = new String("java");
        System.out.println("language2 = " + language2);

        boolean result3 = language1.equalsIgnoreCase(language2);
        System.out.println("result3 whether language1 and language2 are equal after using equalIgnoreCase() = " + result3);// true case sensitivity is ignored

        System.out.println("=========================================================================");

        //contains(String1): checks if the given string is contained in the string. return type --> boolean
        String sentence = "I love Java Programming Language";
        System.out.println("sentence = " + sentence);

        boolean r4 = sentence.contains("C#");
        System.out.println("sentence contains(\"C#\") = " + r4);

        boolean r5 = sentence.contains("Java");
        System.out.println("sentence contains(\"Java\")= " + r5);

        System.out.println("=========================================================================");

        //startsWith(String1): checks if the String started with the given character(s). return type --> boolean
        String name = "Wooden Spoon";
        System.out.println("name = " + name);

        boolean result6 = name.startsWith("W");
        System.out.println("name.startsWith(\"W\") = " + result6);

        boolean result7 = name.startsWith("f");
        System.out.println("name.startsWith(\"f\") = " + result7);

        //endsWith(String): checks if the String ends with the given character(s). return type --> boolean
        boolean result9 = name.endsWith("j");
        System.out.println("name.endsWith(\"j\") = " + result9);

        boolean result10 = name.endsWith("on");
        System.out.println("name.endsWith(\"on\") = " + result10);


    }
}
