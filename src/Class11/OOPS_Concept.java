package Class11;

import Class11.Inheritance.CClass;
import Class11.Polymorphism.UserMethods;

public class OOPS_Concept {
    public static void main(String[] args) {

        /**
         * OOPS Concept:
         *
         * 1. Encapsulation
         *      Wrapping up the code a single unit (eg: Class).
         *      To implement Encapsulation, we create Class and write code in it.
         *
         * 2. Abstraction
         *      Hiding unnecessary information from user.
         *      To implement Abstraction, we create methods.
         *
         * 3. Inheritance
         *      -> To implement Inheritance, we create parent-child set up between two classes.
         *      -> childClass can access parent methods/variables (except private method/variable)
         *      -> we use "extends" keyword with Child class to achieve Inheritance
         *      -> a class can extend ONLY 1 class (why? - Diamond Problem)
         *
         * 4. Polymorphism
         *      -> same name but different forms
         *      -> In Java: when we have two or more methods with SAME name.
         *      -> Types:
         *          1. Compile Time Polymorphism (Static Binding or Method Overloading)
         *          2. Run Time Polymorphism (Dynamic Binding or Method Overriding)
         *
         * Compile Time Polymorphism (Static Binding or Method Overloading):
         *      In a class, we have two or more methods with same name but different arguments (parameter, input)
         *      Ways to set different arguments:
         *          a) different number of arguments
         *          b) different data-types of arguments
         *          c) different sequence of arguments
         *  Note: Return-type DOES NOT play any role in Compile Time Polymorphism
         *
         * Run Time Polymorphism (Dynamic Binding or Method Overriding):
         *      This can be achieved ONLY in Inheritance set-up
         *      When we overwrite/override a parent class method in Child class.
         *      When we have method with same name and same number of arguments in parentClass and in childClass.
         *
         * ************
         *
         * super - keyword
         *
         * We use 'super' keyword, when we want to call/execute parent-class method within child-class method.
         *
         *
         */

        String name = "peace";
        int nameLength = name.length();
        System.out.println(name.toUpperCase());

        name.substring(2);

        name.substring(2,4);

        UserMethods um = new UserMethods();

        um.addNum(2, 3);

        um.addNum(4, 3 , 2);


        CClass c1 = new CClass();

        c1.printParentName();

        c1.myMethod();



    }
}
