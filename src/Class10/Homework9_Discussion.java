package Class10;

import java.util.Arrays;

public class Homework9_Discussion {

    public String hwName = "Lab";
    public static double balance = 23.43;

    public static void main(String[] args) {

        System.out.println(toTitlecase("       happy    hoLIDays    to You          aLl"));
        // System.out.println(toTitlecase(""));
//        System.out.println(toTitlecase("happY Holidays"));
//        System.out.println(toTitlecase("happY Holidays"));


        int[] a1 = {11, 22, 33, 44, 55};
        // System.out.println(Arrays.toString(reverseArray(a1)));





    }

        // Due: Mar 25, 2021

        /**
         * Write a method to convert given string into Titlecase
         * iamHappYtoDAy
         *
         * Iamhappytoday
         *
         */
        // Sally
        public static String toTitlecase (String myString) {
            if (myString.trim().length() > 0) {
                String[] myStringArray = myString.trim().split("\\s+");
                myString = "";
                for (int i = 0; i < myStringArray.length; i++) {
                    myString = myString + myStringArray[i].substring(0, 1).toUpperCase() + myStringArray[i].substring(1).toLowerCase() + " ";
                }
                myString = myString.trim();
            } else {
                myString = "Please enter a valid string";
            }
            return myString.trim();
        }


        /**
         * Write a method that will tell grade to student for given score and MaxScore
         */


        /**
         * Write a method that will reverse any given int-array
         */
        // Nazrin
//        public static int[] reverseArray (int[] nums) {
//            int[] revNums = new int[nums.length];
//            for (int i = 0; i < nums.length; i++) {
////                int rev = nums[i];
////                nums[i] = nums[nums.length - i];
//                revNums[i] = nums[nums.length-1-i];
//            }
//            return revNums;
//        }

        public int[] reverseArray (int[] nums) {
            int[] revNums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
//                int rev = nums[i];
//                nums[i] = nums[nums.length - i];
                revNums[i] = nums[nums.length-1-i];
            }
            return revNums;
        }


        /*
                nums -->    [11, 22, 33, 44, 55]
                revNums --> [55]
                revNums[0] = nums[nums.length-1-0]  i=0
                revNums[1] = nums[nums.length-1-1]
                revNums[2] = nums[nums.length-1-2]
                revNums[3] = nums[nums.length-1-3]
                revNums[4] = nums[nums.length-1-4]
         */

        /**
         * Write a method that return the number of words in given sentence.
         */

}
