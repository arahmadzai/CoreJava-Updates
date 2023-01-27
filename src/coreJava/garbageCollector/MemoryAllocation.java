package coreJava.garbageCollector;

import coreJava.classesAndObjects.Developer;

class Car{

    public String brand;
    public String model;
    public String color;// default value = "null";
    public int year;// default value = 0
    //since they are instance variables, they will be stored along with the objects at the heap memory.

}

public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100;//stack

        Car car = new Car();
        // stack   heap

        System.out.println("------------------------------------------------");

        Developer employee1 = new Developer("Abidullah Rahimi", 35, 'M', "AFG32", "Java Developer", 150000, "Java");
        Developer employee2 = employee1;//one object referenced by 2 reference variables
        //1 object stored at heap and 2 ref variables stored at stack


        System.out.println(employee1);//referencing one object
        System.out.println(employee2);//referencing one object ==> as though as multiple doors to one room?

        System.out.println("----------------------------------------------------------");

        String batch1 = new String("Java");
        //            heap outside pool   "Java" is a string literal it will be stored in string pool
        String batch2 = batch1;
        String batch3 = batch1;//now we have one object with less memory usage
       // String1 batch2 = new String1("Java");
        //String1 batch3 = new String1("Java");// we have 3 objects with more memory








    }

    public static void method1(){
 int b = 200;//stack
    }

    public static void method2(){
        String c = "Hello World";
        //   stack    heap (String1 pool)

        String d = new String("Hello World");
        //   stack          heap
    }






}
