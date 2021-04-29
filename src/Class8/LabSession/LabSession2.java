package Class8.LabSession;

import java.util.Arrays;

public class LabSession2 {
    public static void main(String[] args) {

//        // print "hello" 10 times.
//        System.out.println("Hello"); // count=1
//        System.out.println("Hello"); // count=2
//        System.out.println("Hello"); // count=3
//        //
//        //
//        System.out.println("Hello"); // count=10
//        // for, while, do-while
//
//        for (int i=1 ; i <= 10 ; i++) {
//            System.out.println("Hello");
//            // i++
//        }

        /**
         * Write code to reverse the given array.
         * ReversedArray should be in reversedArray variable
         *
         * reversedArray -> [77, 66, 55, 44, 33, 22, 11]
         */

        int[] array = {11, 22, 33, 44, 55, 66, 77};
        int[] reversedArray = new int[array.length];

        // give me the value at last-index of array
//        reversedArray[0] = array[array.length-1-0];   // 77
//        reversedArray[1] = array[array.length-1-1];   // 77, 66
//        reversedArray[2] = array[array.length-1-2];   // 77, 66, 55
//        // ..
//        // ..
//        reversedArray[array.length-1] = array[array.length-1-array.length-1];

        for (int i=0 ; i < array.length ; i++) {
            reversedArray[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(reversedArray));


        String[] myWords = {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};
        /**
         * count the number of time "happy" present in the myWords array (ignore cases)
         */
        /*
        int count = 0

            picked index-0 word // myWords[0]
            if (compare with "happy" (ignoring cases))  // equals() -- equalsIgnoreCase()

            picked index-1 word
            if (compare with "happy" (ignoring cases))
                increase count by 1 (count=1)

            picked index-2 word
            if (compare with "happy" (ignoring cases))

            picked index-3 word
            if (compare with "happy" (ignoring cases))
                increase count by 1 (count=2)


            picked index-last word
            if (compare with "happy" (ignoring cases))
                increase count by 1 (count=2)

         */
        int count = 0;
//        String val = myWords[0];
//        if (val.equalsIgnoreCase("happy")) {
//            count++;
//        }
        // {"peace", "Happy", "happiness", "haPPy"} --> 4

        for (int i=0 ; i < myWords.length ; i++) {
            if (myWords[i].equalsIgnoreCase("happy")) {
                count++;
            }
        }
        System.out.println(count);



















        /**
         * Write a code to reverse an int-array
         */
        int[] myArray = {11, 44, 22, 66, 44, 76, 54, 22, 55};









    }
}
