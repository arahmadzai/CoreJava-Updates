package coreJava;

public class PrimitiveCasting {

    public static void main(String[] args){

        // implicit casting (automatically):
        int a = 100;
        double b = a;

        System.out.println("a = " + a); // a = 100
        System.out.println("b = " + b); // b = 100.0

        System.out.println("-----------------------------------------------");

        // explicit casting:
        double x = 20.5;
        int y = (int)x;

        System.out.println("x = " + x); // x = 20.5
        System.out.println("y = " + y); // y = 20



    }
}
