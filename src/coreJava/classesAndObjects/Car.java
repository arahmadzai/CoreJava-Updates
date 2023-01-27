package coreJava.classesAndObjects;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public void setInfo(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public class CarEngine {//Inner class

        public void method() {
            System.out.println(make);
            System.out.println(wheels);
        }

    }

        public static class StaticInnerClass{

            public void method(){
                System.out.println(wheels);
            }
        }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

