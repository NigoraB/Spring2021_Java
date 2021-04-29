package Class12.LabSession;

import java.util.Arrays;

public class LabSession_2 {
    /**
     *
     */
    public static void main(String[] args) {


        System.out.println("happy".toUpperCase());      // HAPPY


        MyMethods m = new MyMethods();
        m.HeyUser("happy");


    }

    /**
     * Create a method that will find the max value from the given int-array
     *
     * input: int[]
     * return type: int
     *
     *
     * [90, 189, 20, 143, 71, 110, 54]
     *
     *    max=90
     * max > 189 (if true, take 90 for next comparison, else take 189)
     *    max=189
     * 189 > 20 (if true, take 189 for next comparison, else take 20)
     *    max=189
     * 189 > 143 (if true, take 189 for next comparison, else take 143)
     *
     * 143
     */
    public int findMaxInArray(int[] arr) {
        int max = arr[0];
        for (int i=1 ; i< arr.length ; i++ ) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    /**
     * Write a method that would return the length of all given names.
     *
     * input: String[]
     * return type: int[]
     *
     * input (String[]) : {"happy", "happiness", "joy", "give"}
     * output (int[]) : {5, 9, 3, 4}
     *
     */
    public int[] findLengthNames(String[] names) {
        int[] count = new int[names.length];                // [ , , , ]
        for(int i = 0; i <= names.length - 1 ; i++) {
            count[i] = names[i].length();                   // [ 5, 9, , ]
        }
        System.out.println(Arrays.toString(count));
        return count;
    }

    /**
     * Write a method that would return only names which are having more than 6 letters.
     *
     * inputs: String[]
     * {"happy", "happiness", "joy", "give"}
     *
     *
     * return type: String[]
     *
     * 1. calculate how many names are having length > 6
     * 2. create new array with that count
     * 3. store names in new array which are having length > 6
     *
     */


}
