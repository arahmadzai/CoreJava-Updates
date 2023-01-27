package coreJava.garbageCollector;


import coreJava.classesAndObjects.Cat;

public class GarbageCollection {


    public static void main(String[] args) {

        //any object to be eligible for garbage collection it must be unreferenced first,
        // then it will be destroyed or deleted by garbage collector.
        String s1 = "Java";
       s1 = null;//this null keyword doesn't take any memory, because it doesn't refer to any object

        System.out.println(s1);

        //System.out.println(s1.toUpperCase()); in order to use the instance the object must exist

        // System.out.println(s1.replace(null, "Python")); through null no instance and methods can be called

        String a = "";//still an object
        String b = null;//not an object

        System.out.println("--------------------------------------------------------------------");

        String str1 = "Python";
        str1 = "Cydeo";//Python will be unreferenced and become eligible for garbage collection.

        System.out.println(str1);

        System.out.println("--------------------------------------------------------------");

        Cat Cat1 = new Cat();
        Cat1.setInfo("Loki", "Chow Chow", "Medium", 'S', 3 );

        Cat Cat2 = new Cat();
        Cat2.setInfo("Chuck", "BullCat", "Large", 'M', 2);

        //Cat1 = null;//one way of unreferencing

        Cat1 = Cat2;//second way of unreferencing
        System.out.println("Cat1 = " + Cat1);
        System.out.println("Cat2 = " + Cat2);

       //new Cat().finalize();









    }



}
