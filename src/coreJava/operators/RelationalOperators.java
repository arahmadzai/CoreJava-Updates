package coreJava.operators;

public class RelationalOperators {

    public static void main(String[] args){

    //Greater than >
        boolean result1 = 100 > 90; // true
        boolean result2 = 200 > 300; // false

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------------");

    //Greater than or equal >=
        boolean result3 = 10 >= 9; // true
        boolean result4 = 90 >= 100; // false

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

        System.out.println("-----------------------------------------------");

    //Less than <
        boolean result5 = 5 < 6; // true
        boolean result6 = 20 < 9; // false

        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);

        System.out.println("-----------------------------------------------");

    //Less than or equal <=
        boolean result7 = 1000 <= 2000; // true
        boolean result8 = 25 <= 20; // false

        System.out.println("result7 = " + result7);
        System.out.println("result8 = " + result8);

        System.out.println("-----------------------------------------------");

    //Equal =
        boolean result9 = 10 == 10; // true
        boolean result10 = 10 == 11; // false

        System.out.println("result9 = " + result9);
        System.out.println("result10 = " + result10);

        System.out.println("-----------------------------------------------");

    //Not equal !=
        boolean result11 = 100 != 200; // true
        boolean result12 = 200 != 200; // false

        System.out.println("result11 = " + result11);
        System.out.println("result12 = " + result12);

    }
}
