package coreJava.classesAndObjects;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int intNumber = input.nextInt();

        System.out.println("Enter a double");
        double doubleNum = input.nextDouble();

        input.nextLine();

        System.out.println("Enter a word");
        String word = input.nextLine();

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        System.out.println("Enter a boolean expression");
        boolean expression = input.hasNextBoolean();

        input.close();

        System.out.println("intNumber = " + intNumber);
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("word = " + word);
        System.out.println("sentence = " + sentence);
        System.out.println("expression = " + expression);






    }

}
