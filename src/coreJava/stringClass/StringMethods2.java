package coreJava.stringClass;

public class StringMethods2 {

    public static void main(String[] args) {

        //replace(oldValue, newValue): replaces all the matching Character(s) of the String1 with the give
        // new character(s). return type --> String1
        String str1 = "Wooden Spoon";
        System.out.println("str1 = " + str1);

        str1 = str1.replace("o", "e");
        System.out.println("str1 = " + str1);

        String sentence1 = "I love Java, Java is the best Programming Language";
        System.out.println("sentence1 before replace = " + sentence1);

        sentence1 = sentence1.replace("Java", "C#");
        System.out.println("sentence1 after replace method = " + sentence1);

        sentence1 = sentence1.replace("C#", "Java");
        System.out.println("sentence1 after replace method = " + sentence1);

        System.out.println("=========================================================================");

        //replaceFirst(): replaces the first matching character. return type -->String1
        String str2 = "Wooden Spoon";
        System.out.println("str2 before using replaceFirst() = " + str2);

        str2 = str2.toLowerCase().replaceFirst("o", "e");
        System.out.println("str2 after using replaceFirst() = " + str2);

        String sentence2 = "I love Java, Java is the best Programming Language";
        System.out.println("sentence2 before replaceFirst() = " + sentence2);

        sentence2 = sentence2.replaceFirst("Java", "C#");
        System.out.println("sentence2 after replaceFirst() = " + sentence2);

        System.out.println("=========================================================================");

        //subString(begIndex ~ end Of String1): creates a subString from the given index till the end of the String.
        // return type --> String
        String str3 = "Java Programming Language";
        System.out.println("str3 before substring = " + str3);

        String result1 = str3.substring( str3.indexOf("P")); //Programming Language
        System.out.println("Result1 = " + result1);

        String result2 = str3.substring( str3.indexOf("P"), str3.indexOf(" L"));//Programming
        System.out.println("result2 = " + result2);

        String result3 = str3.substring(str3.lastIndexOf("L"));
        System.out.println("result3 = " + result3);

        String result4 = str3.substring(5);//Programming Language
        String result5 = str3.substring(5, str3.length());//Programming Language
        String result6 = str3. substring(str3.indexOf("Pr"), str3.lastIndexOf("e")+1);//Programming Language
        String result7 = str3.substring(str3.indexOf("Pr"));//Programming Language

        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);
        System.out.println("result7 = " + result7);

        String s1 = "I love Java";
        System.out.println("s1 = " + s1);
        String result8 = s1.substring(2, 6);
        System.out.println("result8 = " + result8);

        System.out.println("=========================================================================");

        //repeat(N): repeats the String N number of times. return type --> String
        //repeat() method was added to JDK 11, we need to have 11 or newer version to use this method.
        String str4 = "Java";
        System.out.println("str4 = " + str4);
        str4 = str4.repeat(3);
        System.out.println("str4 after using repeat() with N parameter = " + str4);



    }
}
