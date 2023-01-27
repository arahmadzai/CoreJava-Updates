package coreJava.classesAndObjects;

public class Cat {

    //Class is a blueprint/template for creating objects, defining their fields (attributes) and methods (actions).
    //object is an instance of the class, or a piece of data,
    // each object will have a separate copy of the instance variable, but static also known as class member is
    // common between all the objects of the class it can be called through the class without the need for an object.
    // we can have, static class (only nested, can not be instantiated),block (for initializing static variable),
    // method (only manipulate statics inside static method) and variable (only one copy shared among all objects).

    public String name, breed, color;
    public char size;
    public int age;

    public static boolean has4legs;

    static {
        has4legs = true;
    }

    public Cat() {
    }

    public Cat(String name, String breed, String color, char size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public static int CatCount(int Cat1, int Cat2){
        return Cat1 + Cat2;
    }

    public void setInfo(String name, String breed, String color, char size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
