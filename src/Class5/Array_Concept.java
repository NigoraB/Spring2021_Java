package Class5;

import java.util.Arrays;

public class Array_Concept {
    public static void main(String[] args) {
//        int a = 4;
//        int b = 14;
//        String phrase = "Be Good";
//        int num = 99;
//        String name = "Happy";
//        char myChar;
//        boolean isNight = true;
//
//
//        System.out.println(a);
//
//        a = 8;
//
//        System.out.println(a);
//
//
//        String newname = name + " Peace";
//                    // "Happy" + " Peace"
//                    // "Happy Peace"
//
//        System.out.println(newname);    // Happy Peace
//
//        newname = "Good Morning";
//
//        System.out.println(newname);

        /**
         * Array []
         *
         * It's a non-primitive datatype, which can store multiple values of SAME datatype.
         *
         * This to know before creating an Array:
         * 1. What will be the datatype of values you are going to store.
         * 2. a) Total number of values that you need to store.
         *      OR
         *    b) All the values that you want to store in array.
         *
         * Want to create an array to store names of top-5 students of this batch?
         *
         * Syntax to create an array
         *  if 1 and 2a
         *  datatype[] arrName = new datatype[totalNumber];
         *
         *  if 1 and 2b
         *  datatype[] arrName = {value1, value2, value3, value4, value5};
         *
         *
         */
        double[] myBills = new double[5];
        // Array -> [  ,  ,  ,  ,  ]
        // Index -->  0  1  2  3  4


        int myBillsLength1 = myBills.length;
        System.out.println("Before anything: Length of myBills Array: " + myBillsLength1);



        myBills[3] = 23.31;
        // Array -> {  ,  ,  , 23.31 ,  }
        // Index -->  0  1  2    3     4

        myBills[0] = 10.10;
        // Array -> {10.10  ,  ,  , 23.31 ,  }
        // Index -->  0  1  2    3     4

        myBills[1] = 22.2;

        myBills[2] = 22.2;

        myBills[4] = 4.4;
        // Array -> { 10.10 , 22.2 , 22.2  , 23.31  , 4.4 }
        // Index -->    0       1       2       3       4

        System.out.println(myBills);
        // shortcut to print an array
        System.out.println(Arrays.toString(myBills));

        // myBills[5] = 10.23;  When index is out of the valid range, user get ArrayIndexOutOfBoundsException

        // How to print value from a specific index
        // print value at index-3
            /*
                myBills[3] --> represents the value at index-3
             */
        System.out.println(myBills[3]);

        // Store the value at index-2 in new variable(foodBill)
        double foodBill = myBills[2];

        // Change the value at index-4
        // new value should be the total of values at index-0 and index-3
        myBills[4] = myBills[0] + myBills[3];

        System.out.println(myBills[4]);
        System.out.println(Arrays.toString(myBills));

        /**
         * to find the length of Array
         *
         * length   <-- In Array, length is a variable, NOT method.
         */
        int myBillsLength = myBills.length;
        System.out.println("Length of myBills Array: " + myBillsLength);


        /**
         * Creating array when user is aware of all value that going to be stored
         */
        String[] myCars = {"Ford", "Tesla", "BMW", "MErc", "NissaN"};

        System.out.println("\n\nNumber of my fav car companies: " + myCars.length);

        // Verify if my 2nd fav car is BMW (ignore cases)
        // boolean is2ndFav_BMW = myCars[1].equalsIgnoreCase("BMW");
        System.out.println("Verify if my 2nd fav car is BMW (ignore cases) --> " + myCars[1].equalsIgnoreCase("BMW"));


        // print my 10th fav car company
        // System.out.println(myCars[9]);
        // when the index is not present in the array, user gets ArrayIndexOutOfBoundsException


        // String[] myCars = {"Ford", "Tesla", "BMW", "MErc", "NissaN"};
        // print the 10th fav car company if present, else print the least fav car company.
        String cc10 = myCars.length>=10 ? myCars[9] : myCars[myCars.length-1];

        System.out.println("cc10 --> " + cc10);




























    }
}
