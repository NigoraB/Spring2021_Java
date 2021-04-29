package Class2;

public class NonPrimitiveDatatypes {

    public static void main(String[] args) {

        /**
         *  How many datatypes we have in Java?
         *  Primitive
         *      byte, short, int, long, float, double, char, boolean
         *  Non-Primitive (all class and Interface)
         *      String, Array, User defined Class, Interface
         *
         *
         *
         */
//        int age = 20;
//        System.out.println("Age: " + age);  // Age: 20
//        age = 40;
//        System.out.println("Age: " + age);  // Age: 40


        /**
         * String: is non-primitive datatype.
         * can store single or multiple characters
         * while storing the value in variable, value must be within double-quotes
         *
         * *String is a class.
         *
         */

        String myName = "Happy Peace";
        // created variable ("myName) of String datatype, and stored value "Happy Peace" in it.

        System.out.println("Full name: " + myName);     // Full name: Happy Peace

        String singles = " a b c d     e  f";
        String info = "Value in single variable -> ";
        int num = 10;
        System.out.println(info + num + singles);
        // Value in single variable -> 10 a b c d     e  f


        myName = "Laugh Grow" + myName;     // "Laugh GrowHappy Peace"

        System.out.println("Full name: " + myName);     // Full name: Laugh GrowHappy Peace

        /**
         * Array: is non-primitive datatype.
         *  can store multiple values of SAME datatype.
         *
         * Symbol of array: []
         *
         */





    }

}
