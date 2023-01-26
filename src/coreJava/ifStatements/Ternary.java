package coreJava.ifStatements;

public class Ternary {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        int max;

        if (a > b){
            max = a;
        }else {
            max = b;
        }

        System.out.println("max = " + max);

        System.out.println("-----------------------------------------------");

        int max2;
        max2 = (a > b)? a : b;

        System.out.println("max2 = " + max2);

        System.out.println("-----------------------------------------------");

        int score = 90;
        String grade = "Invalid Score";

        if (score > 0 && score <= 100){
            if (score >= 90 && score <= 100){
                System.out.println("grade = " + "A");
            } else if (score >= 80 && score < 90 ) {
                System.out.println("grade = " + "B");
            } else if (score >= 70 && score < 80) {
                System.out.println("grade = " + "C");
            } else if (score >= 60 && score < 70) {
                System.out.println("grade = " + "D");
            } else if (score < 60 && score > 0) {
                System.out.println("grade = " + "F");
            }
        }else {
            System.out.println("Invalid score "+score);
        }

        System.out.println("-----------------------------------------------");

        String grade2 = "";

        grade2 = (score >= 90 && score <=100)? "A" :(score >= 80 && score < 90 )? "B" :(score >= 70 && score < 80 )? "C"

                 :(score >= 60 && score < 70 )? "D" :(score >= 0 && score < 60 )? "F" : "Invalid Score";

        System.out.println("grade2 = " + grade2);


    }
}
