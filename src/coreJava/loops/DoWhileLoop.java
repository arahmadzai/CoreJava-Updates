package coreJava.loops;

public class DoWhileLoop {

    public static void main(String[] args) {

        //we use do while loop, when we want the body of the loop to execute at least once regardless of the condition.

        int i = 0;

        do {
            System.out.println("Afghanistan");
        }while (i > 5);

        System.out.println("---------------------------------------------------------------------");

        while (i > 5){
            System.out.println("Hello");
        }

        System.out.println("----------------------------------------------------------------------");

        do {
            System.out.println("Hello");
            i++;
        }while (i < 5);





    }
}
