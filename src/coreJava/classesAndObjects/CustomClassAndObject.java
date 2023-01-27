package coreJava.classesAndObjects;

public class CustomClassAndObject {

    public static void main(String[] args) {

        //Class is a blueprint/template for creating objects, defining their fields (attributes) and methods (actions).
        //object is an instance of the class, or a piece of data,
        // each object will have a separate copy of the instance variable, but static also known as class member is
        // common between all the objects of the class it can be called through the class without the need for an object.
        // we can have, static class (only nested, can not be instantiated),block (for initializing static variable),
        // method (only manipulate statics inside static method) and variable (only one copy shared among all objects).


        Cat Cat1 = new Cat("Lucy", "Husky", "Black & white", 'M', 4);

        Cat1.eat();
        Cat1.drink();
        System.out.println(Cat.has4legs);

        System.out.println(Cat.CatCount(1, 1));


    }

}