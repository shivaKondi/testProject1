package com.javapackage;

public class mainClass {


    public static void main(String [] args){

            System.out.println("in main class");

            bmw object1 = new bmw();

            golf object2 = new golf();

            //calling methods from abstract class
            object1.first_method();
            object1.second_method();
            object2.first_method();
            object2.second_method();
            //calling abstract class
        object1.abstractClass_method();
        object2.abstractClass_method();
        // calling methods from the class
        object1.bmw_method_1();
        object1.bmw_method_2();

        object2.golf_method();
        object2.golf_method_2();

    }
}
