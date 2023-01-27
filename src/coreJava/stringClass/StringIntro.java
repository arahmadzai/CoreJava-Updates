package coreJava.stringClass;

public class StringIntro {

    public static void main(String[] args) {

    //String class is present in java.lang.String .
    // String is an object that represent sequence of character, it can contain alphanumeric characters
    // Object can be created By String1 Literal "" (stored at string constant pool special memory allocation inside Heap)
    // and By new keyword
    // will be stored in (Heap).
    // in order to make Java memory efficient String1 literal concept is used.
    // if the object already exist in the pool, a reference of the pooled instance will return. one object represented
    // by multiple variables).

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Java"; // reference of the pooled instance will return. one object represented by multiple variables

        System.out.println(str1 == str2);//true
        System.out.println(str3 == str1);//true
        System.out.println(str2 == str3);//true
        //since there is only one Java object in string pool, therefore we can compare it using == equal operator

        System.out.println("------------------------------------------------------------------------");

        String language1 = new String("Java");
        String language2 = new String("Java");

        System.out.println(language1 == language2);//false cause there are 2 separate objects in Heap
        System.out.println(language1.equals(language2));// true
        // in order to compare 2 different objects, we must use equal() method.

        System.out.println("------------------------------------------------------------------------");

        String name = "Java";
        name = name.toLowerCase();

        //since String objects are immutable, therefore we will get a new obj after modification, if the original
        // object is not referenced by any other variable, it will become eligible for garbage collection.
        System.out.println(name);

        System.out.println("------------------------------------------------------------------------");

        String country = "Pakistan";
        country = "Afghanistan";

        System.out.println(country);// Pakistan replaced by Afghanistan, therefore Pakistan became eligible for garbage collection.



    }
}
