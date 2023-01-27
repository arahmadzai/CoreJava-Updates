package coreJava.methods;

public class MethodOverloading {

    public static void main(String[] args) {

        //method overloading is having more than one method with the same name and parameters.
        //method overloading increases the reuse-ability and readability.
        //method overloading is an example of compile time polymorphism also known as static binding (based
        // on the argument passed to parameters compiler decides which method to call)
        //base on the argument provided compiler decides which version of the method to call.

        System.out.println(sum(2, 5.5));

        int sum1 = sum(10, 20, 30);
        System.out.println(sum1);

        System.out.println(sum(2.5, 50, 5.5, 6));

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return sum(a, b) + c;
    }

    public static int sum(int a, int b, int c, int d){
        return sum(a, b, c) + d;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static double sum(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public static double sum(double num1, double num2, double num3, double num4){
        return num1 + num2 + num3 + num4;
    }
}
