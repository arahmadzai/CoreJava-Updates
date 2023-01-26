package coreJava.operators;

public class LogicalOperators {

    public static void main(String[] args){

    //Logical AND &&

        // initializing variables
        int a = 10, b = 20, c = 20, d = 0;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        // using logical AND to verify
        // two constraints
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");

        System.out.println("-----------------------------------------------");

    //Logical OR ||:

        // initializing variables
        int num1 = 10, num2 = 1, num3 = 10, num4 = 30;

        // Displaying num1, num2, num3
        System.out.println("Var1 = " + num1);
        System.out.println("Var2 = " + num2);
        System.out.println("Var3 = " + num3);
        System.out.println("Var4 = " + num4);

        // using logical OR to verify
        // two constraints
        if (num1 > num2 || num3 == num4)
            System.out.println("One or both + the conditions are true");
        else
            System.out.println("Both the + conditions are false");

        System.out.println("-----------------------------------------------");

    //Logical NOT !

        // initializing variables
        int x = 10, y = 1;

        // Displaying x, y, z
        System.out.println("Var1 = " + x);
        System.out.println("Var2 = " + y);

        // Using logical NOT operator
        System.out.println("!(x < y) = " + !(x < y));
        System.out.println("!(x > y) = " + !(x > y));


    }
}
