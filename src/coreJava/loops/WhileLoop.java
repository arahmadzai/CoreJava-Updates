package coreJava.loops;

public class WhileLoop {

    public static void main(String[] args) {

        //while loop is repeated if statement, it's used when we don't know the exact number of iteration.
        //it's also known as entry control loop, that means condition will be checked after the loop initialized,
        // if the condition is true, the body of the loop will execute.

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        while (true){
            System.out.println("Hello");
            break;
        }

        int x = 10;

        while (x >= 1){
            System.out.println(x);
            x--;

        }

    }
}
