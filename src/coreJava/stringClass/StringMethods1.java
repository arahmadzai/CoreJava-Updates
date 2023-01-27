package coreJava.stringClass;

public class StringMethods1 {

    public static void main(String[] args) {

        // charAt(int index): returns the char at given index, return type --> char

        String str = "Cydeo";
        //index:      01234
        char ch3 = str.charAt(2);
        System.out.println(ch3);// 3rd index character# 4 is: d.

        String country = "Afghanistan";
        char lastChar = country.charAt(country.length()-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("=========================================================================");

        //length(): returns the total numbers of characters --> return type int
        String str2 = "Afghanistan";
        int length = str2.length();
        System.out.println(length);

        int lastIndex = str2.length() - 1; // since index number starts from zero, we need to minus 1 from the total length
        System.out.println(lastIndex);

        System.out.println("=========================================================================");

        //toLowerCase(): returns all the lower case version of the String. return typ --> String
        String str3 = "Java";
        System.out.println("str3 = " + str3);

        str3 = str3.toLowerCase();
        System.out.println("str3 = " + str3);

        System.out.println("=========================================================================");

        //toUpperCase(): returns all the UPPER case version of the String1. return typ --> String1
        String str4 = "Java";
        System.out.println("str4 = " + str4);
        str4 = str4.toUpperCase();
        System.out.println("str4 = " + str4);

        System.out.println("=========================================================================");

        //trim(): returns the string without white spaces or blanks. return type --> String1
        String str5 = "   Java Programming Language      ";
        System.out.println("str5 before trim = " + str5);
        str5 = str5.trim();
        System.out.println("str5 after trim = " + str5);

        System.out.println("=========================================================================");

        //indexOf(): returns the first matching character, index number. return type --> int
        String str6 = "Wooden SpoOn";
        System.out.println("str6 = " + str6);
        int indexOfFirstO = str6.indexOf("o");//1
        System.out.println("indexOfFirstO = " + indexOfFirstO);

        int indexOfSecondO = str6.indexOf("od"); //2: last character is always excluded
        System.out.println("indexOfSecondO = " + indexOfSecondO);

        int indexOfThirdO = str6.toLowerCase().indexOf("oon");
        System.out.println("indexOfThirdO = " + indexOfThirdO);//9

        int indexOfLastO = str6.toLowerCase().indexOf("on"); //10
        System.out.println("indexOfLastO = " + indexOfLastO);

        int lastIndexO = str6.toLowerCase().lastIndexOf("o");
        System.out.println("lastIndexO = " + lastIndexO);//10


    }
}
