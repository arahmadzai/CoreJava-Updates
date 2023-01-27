package coreJava.methods;

public class CustomMethodsParameter {

    public static void main(String[] args) {

        //we only provide parameter if method must have additional information to perform its task.
        // Parameters passed to the method act as the variable, inside the method body.
        // if method has the parameter, we must provide the argument ( value/variable )in the parameter.
        // argument could be a value or a variable that contains a value.

        int n = 10;
        displayValue(n);
        displayValue(5);

        System.out.println("------------------------------------------------------------------");

        int age = 45;
        boolean isUSCitizen = true;
        eligibleToVote(21, false);
        eligibleToVote(21, true);
        eligibleToVote(age, isUSCitizen);

        System.out.println("------------------------------------------------------------------");

        int num1 = 100;
        int num2 = 99;

        oddOrEven(num1);
        oddOrEven(num2);

        oddOrEven(0);
        oddOrEven(5);
        oddOrEven(6);

        System.out.println("------------------------------------------------------------------");

        dayOfTheWeek(7);


    }

    public static void displayValue(int num){
        System.out.println("The value is: " + num);
    }

    public static void eligibleToVote(int age, boolean isCitizen){

        if (age >= 21 && isCitizen == true){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote.");
        }
    }

    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {

            System.out.println(number + " is odd number");
        }

    }

    public static void dayOfTheWeek(int a){
        String day = "Invalid entry";
        switch (a){
            case 1:
                day = "Saturday";
                break;
            case 2:
                day = "Sunday";
                break;
            case 3:
                day = "Monday";
                break;
            case 4:
                day = "Tuesday";
                break;
            case 5:
                day = "Wednesday";
                break;
            case 6:
                day = "Thursday";
                break;
            case 7:
                day = "Friday";
                break;

        }
        System.out.println("day is = " + day);
    }

}
