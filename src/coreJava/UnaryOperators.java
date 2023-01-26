package coreJava;

public class UnaryOperators {

    public static void main(String[] args) {

        //Positive & Negative (Unary Plus Operator + &  Unary Minus Operator -)
        int a = -100;
        int b = +200;

        boolean aIsNegativeNumber = a < 0;
        boolean bIsPositiveNumber = b > 0;

        System.out.println("aIsNegativeNumber = " + aIsNegativeNumber);
        System.out.println("bIsPositiveNumber = " + bIsPositiveNumber);

        System.out.println("-----------------------------------------------");

       // Increment & Decrement
        int x = 10;
        System.out.println(++x); //11
        System.out.println(--x); //10
        System.out.println(x++); //10
        System.out.println(x); //11
        System.out.println(x--); //11
        System.out.println(x); //10





    }
}
