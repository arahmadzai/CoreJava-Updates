package coreJava.operators;

public class ShorthandOperators {

    public static void main(String[] args){

    //Assignment
        int a = 100;
        a = 200; // assigns new value 200 to a

        System.out.println("a = " + a);

        System.out.println("-----------------------------------------------");
    //Addition Assignment
        int b = 200;
        b += 100; // increases the value by 100

        System.out.println("b = " + b);

        System.out.println("-----------------------------------------------");

    //Subtraction Assignment
        int c = 200;
        c -= 100; // decreases the value by 100

        System.out.println("c = " + c);

        System.out.println("-----------------------------------------------");

    //Multiplication Assignment Operator
        int d = 20;
        d *= 5; //multiplies the value by 5

        System.out.println("d = " + d);

        System.out.println("-----------------------------------------------");

    //Division Assignment
        int e = 20;
        e /= 5; // divides the value by 5

        System.out.println("e = " + e);

        System.out.println("-----------------------------------------------");
        
    //Remainder Assignment
        int f = 200;
        f %= 10;

        System.out.println("f = " + f);

    }
}
