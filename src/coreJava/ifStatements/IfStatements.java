package coreJava.ifStatements;

public class IfStatements {

    public static void main(String[] args) {

        //If statement is used for evaluating conditions, if there is one condition we use single If Statement
        // If and else is used if we have two possible conditions
        // Multi-branch If Statement, we use it when we create conditions for more than 2 possible outcomes.

        int score = 45;

        if (score > 65) {

            System.out.println("Congratulation on passing your exam!");

        }

        System.out.println("-----------------------------------------------");

        int age = 21;

        if (age >= 21){
            System.out.println("You are qualified for a Commercial Driving License.");
        }else {
            System.out.println("You are not eligible for a CDL.");
        }

        System.out.println("-----------------------------------------------");

        int number;
        number = 0;

        if (number > 0){
            System.out.println(number+" is positive");
        } else if (number < 0) {
            System.out.println(number+" is negative");
        }else {
            System.out.println(number+" is zero");
        }

        System.out.println("-----------------------------------------------");

        int score2 = 90;
        String grade = "Invalid Score";

        if (score2 > 0 && score2 <= 100){
            if (score2 >= 90 && score2 <= 100){
                System.out.println(grade = "A");
            } else if (score2 >= 80 && score2 < 90 ) {
                System.out.println(grade = "B");
            } else if (score2 >= 70 && score2 < 80) {
                System.out.println(grade = "C");
            } else if (score2 >= 60 && score2 < 70) {
                System.out.println(grade = "D");
            } else if (score2 < 60 && score2 > 0) {
                System.out.println(grade = "F");
            }
        }else {
            System.out.println("Invalid score "+score2);
        }


    }
}
