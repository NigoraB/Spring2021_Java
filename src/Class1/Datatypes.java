package Class1;

import Class12.AccessModifier.AccessModifier_Concept;

public class Datatypes {
    public static void main(String[] args) {    // psvm (shortcut for main method in IntelliJ)

        /**
         *
         *  numbers
         *      whole               ->  byte, short, int, long
         *      decimal             ->  float, double
         *
         *  text
         *      single-letter       ->  char
         *      multiple-letter     ->  String
         *
         *  yes/no
         *      true/false          ->  boolean
         *
         *  How many datatypes we have in Java?
         *  Primitive
         *      byte, short, int, long, float, double, char, boolean
         *  Non-Primitive (all class and Interface)
         *      String, Array, User defined Class, Interface
         *
         */

        /**
         * To store a data, we need variable.
         * IMP: type of data must be same as datatype of variable.
         *
         * Syntax to create a variable:
         *      datatype variableName;      // create variable (name='variableName') of datatype type.
         *      variableName = value;       // storing value in variableName variable.
         *      -- OR --
         *      datatype variableName = value;
         *      // create variable (name='variableName') of datatype type.
         *      // AND storing value in variableName variable.
         *
         *
         *      Write code to create float variable of any name?
         *      float varName;
         *
         *
         *  Write to code to store number of cars in your house (2)
         *  byte numOfMyCars = 2;   // 2 is value of byte type...and abc is variable byte type
         *
         *  Good practices to provide names:
         *  1. variables:
         *      -> names cannot have spaces
         *      -> variable name should relate to the stored value
         *      -> starts with lowercase
         *      -> never starts with digit or special character
         *      -> should always follow camelCaseFormat     // camel case format --> camelCaseFormat
         *      eg:
         *      number of my cars -> numberofmycars -> numberOfMyCars
         *
         *  2. Class:
         *      -> names cannot have spaces
         *      -> name should relate to the code inside
         *      -> starts with Uppercase
         *      -> never starts with digit or special character
         *      -> should always follow CamelCaseFormat     // camel case format --> CamelCaseFormat
         *
         *  3. Package:
         *      -> names cannot have spaces
         *      -> name should relate to the java classes inside
         *      -> starts with Uppercase
         *      -> never starts with digit or special character
         *      -> should always follow CamelCaseFormat     // camel case format --> CamelCaseFormat
         */
        /**
         * Primitive Datatypes:
         * byte, short, int, long, float, double, char, boolean
         */
        /**
         * byte: is a primitive datatype.
         * can store only whole numbers ranging from -128 to 127
         */
        byte myAge = 20;
        // what is the datatype of myAge variable? --> byte
        // now, change the value in myAge variable to 21
        myAge = 21;     // replace the value in myAge to 21

        /**
         * short: is a primitive datatype
         * can store only whole numbers ranging from -32,768 to 32,767
         */
        short noOfDaysInYear = 365;
        short currentYear = 2021;

        short numOfCars = 4;

        // System.out.println("365 days in an year");

        System.out.println(noOfDaysInYear); // it will use the value inside the variable.


        // print like, there are 365 days in 2021

        System.out.println("there are 365 days in 2021");

        System.out.println("there are " + noOfDaysInYear + " days in " + currentYear);

        /**
         * int: is a primitive datatype
         * can store only whole numbers ranging from -2,147,000,000 to 2,147,000,000
         *
         * In general, we use int-variable to store whole number.
         */
        int covidCases = 1000000;
        int myDogAgeInYears = 2;

        // print --> As per today, total covid cases in the country: 1000000

        System.out.println("As per today, total covid cases in the country: " + covidCases);

        /**
         * long: is a primitive datatype
         * can store only whole numbers ranging from
         * -9,000,000,000,000,000,000 to 9,000,000,000,000,000,000
         *
         * to store any value as "long" in java-memory,
         *  we need to add 'L' after the value then only java will treat the value as 'long'.
         */
        long numberOfStars = 9999999999L;
        // L is an indicator for Java to treat value as long instead int
        numberOfStars = 8888888888L;


        // Dog age is X-years, weighs Y-pounds
        byte dogAge = 1;
        byte dogWeight = 40;

        System.out.println("Dog age is " + dogAge + "-years, weighs " + dogWeight + "-pounds");
        //                  Dog age is 1-years, weighs 40-pounds

        // float, double, char, boolean
        /**
         * float: is a primitive datatype
         * which can store value with decimal point.
         */
        float mortgageRate = 1.8f;
        // f is an indicator for Java to treat decimal-value as float instead double
        System.out.println(mortgageRate);

        /**
         * double: is a primitive datatype
         * which can store value with decimal point.
         */
        double accBalance = 100000000.19;  // 100000000.19

        /**
         * char: is primitive datatype
         * can store only single character.
         * while storing the value in value, value must be within single-quotes
         */
        char firstAlphabet = 'a';
        System.out.println("First letter in alphabet -> " + firstAlphabet);

        char firstNum = '1';
        System.out.println("First number in counting -> " + firstNum);


        /**
         * boolean: is primitive datatype
         * can store either true or false as value.
         */
        boolean isRaining = false;
        System.out.println("is it raining? -> " + isRaining);

        boolean isEligibleForVote = true;
        System.out.println("are you eligible to vote? : " + isEligibleForVote);







    }
}
