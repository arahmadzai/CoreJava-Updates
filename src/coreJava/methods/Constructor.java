package coreJava.methods;

import coreJava.classesAndObjects.Car;
import coreJava.classesAndObjects.Developer;


public class Constructor {

    public static void main(String[] args) {

  //Constructor is a special method that every class must have, it's used when we create objects of the class
  //we can use constructors to initialize the objects instance variables,  Execution of Constructor always depend on objects
  //whenever we don't define a constructor, the compiler creates a default (no argument) constructor.

        Car car = new Car(); // car object created with default constructor that doesn't need arguments
        car.setInfo("Toyota", "Camry", "White", 2022, 38000);

        System.out.println(car);

        System.out.println();

        Developer developer = new Developer("Abid", 35, 'M', "A01", "Full Stack Lead",
                350000, "Java");//user defined constructor with arguments, must provide
        //instances (fields, attributes) to create or initialize the developer object.

        System.out.println(developer);



    }
}


