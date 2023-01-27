package coreJava.loops;

public class ForLoop {

    public static void main(String[] args) {

  //For Loop runs the given code for specific number of times, it's also called the entry control loop, it first
  //checks the condition, if true will execute it and repeat the code iteration until the condition becomes false

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }

        String word = "Programming Language";

        for (int i = word.length()-1; i >= 0 ; i--) {

            System.out.print(word.charAt(i));
        }

        System.out.println();

        String country = "Afghanistan";

        for (int i = 0; i <= country.length()-1; i++){
            System.out.print(country.charAt(i));
        }

        System.out.println();

        for (int i = country.length()-1; i >= 0 ; i--) {
            System.out.print(country.charAt(i));
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }


    }
}
