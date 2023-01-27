package coreJava.methods;

public class MethodsIntro {

    public static void main(String[] args) {

        /*

       Method also known as function: is block of codes, or set of codes grouped together in order to perform a task,
       we creat methods for reuse-ability purposes
       in order to avoid regrouping same set of codes again and again, we write a method.

        There are two types of methods:

        1. Standard Library Methods such as (String methods, Scanner methods...etc).
        2. User defined methods:

        a. Static Methods
        b. Instance Methods

     Access Modifier: determines the visibility, public is open to the world and always accessible.
     Static Modifier: Allows us to call the method through the class name, no need for object to call the method.
     Return Type: determines if the method returns a value. If return type is void, method does not return any value.
     Method Name: Descriptive name of the function, The same rules that apply to variable names also apply to
      method names.
     Parenthesis: method name is always followed by a set of parenthesis, can be capable of receiving arguments.

     MUST be declared inside the class and outside any other blocks/methods

     When called, the method executes the codes in its body

     When it has finished, the code continues to run

    When we declare a method, parameters can be given

    Parameters act like variables, Used for providing additional
     information if the method needs to perform its task

        Method Overloading:

     Allows us to have more than one method with the same name

     Parameters must be different (either the data type or the number of parameters or sequence)

     Improves the code readability and re-usability

     It’s easier to remember one method name instead of remembering multiple method names

     Return Type of the overloaded method can be same or different

     Method can be overloaded any number of times

     Any method (incl. main method) can be overloaded

     Method Overloading is an example of Compile time polymorphism, also known as static binding that means,
                the version of method is determined at compile time

         */


        displayMessage();

        System.out.println("Hello Cydeo");

        System.out.println("--------------------------------------------------------------------");

       double result = sum(10, 5.2);
        System.out.println("result = " + result);


    }

    public static void displayMessage(){
        System.out.println("Hello World");
        System.out.println("I love Afghanistan");
    }

    public static double sum(double a, double b){
        return a + b;
    }

}
