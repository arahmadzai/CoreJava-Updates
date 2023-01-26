package coreJava;

public class PrimitiveDataType {

    public static void main(String[] args){

        //Integer: age, year, salary, miles
        byte age = 127; // range -128 to 127
        short year = 1986; // range -32768 to 32767
        int salary = 100000; //range -2147483648 to 2147483647
        long miles = 41111111111L; // range -9223372036854775808 to 9223372036854775807

        //Decimals: tax, pi
        double tax = 0.26; //range 4.94065645841246544e-324 to 1.79769313486231570e+308
        float pi = 0.32f; //range 1.40239846e-45f to 3.40282347e+38f

        // symbols: @, #
        char ch1 = '@'; // 0 ('\u0000') to 65535 ('\uffff')
        char ch2 = '#';

        System.out.println("age = " + age);
        System.out.println("year = " + year);
        System.out.println("salary = " + salary);
        System.out.println("miles = " + miles);
        System.out.println("tax = " + tax);
        System.out.println("pi = " + pi);
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        System.out.println("-----------------------------------------------");

        boolean result1 = true;
        boolean result2 = false;
        boolean result3 = 10 > 5;
        boolean result4 = 10 < 5;
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

        System.out.println("-----------------------------------------------");

        int a = 100;
        int b = 200;

        boolean aIsGreaterThanB = a > b;
        System.out.println("aIsGreaterThanB = " + aIsGreaterThanB);


    }
}
