package Class15;

import Class15.InterfacePkg.InterfaceTheory;

import java.util.Arrays;

public class CodeTest_Discussion {
    public static void main(String[] args) {
        CodeTest_Discussion cd = new CodeTest_Discussion();
//        int[] afterRemovingVal = null;
//
//        int[] numbers = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
//        int val = 24;
//        afterRemovingVal = cd.removedIntFromArray(numbers, val);
//        System.out.println("Given array --> " + Arrays.toString(numbers));
//        System.out.println("After removing " + val + " from array --> " + Arrays.toString(afterRemovingVal));
//
//
//        int[] numbers2 = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
//        int val2 = 11;
//        afterRemovingVal = cd.removedIntFromArray(numbers2, val2);
//        System.out.println("Given array --> " + Arrays.toString(numbers2));
//        System.out.println("After removing " + val2 + " from array --> " + Arrays.toString(afterRemovingVal));

        int[] nums = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        System.out.println("smallest missing number : " + cd.missingSmallest(nums));

        InterfaceTheory it;




    }

    /**
     * Question 1:
     * Create a method to return an int-array
     * after removing a given int-value from a given int array.
     *
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */
    /**
     * Inputs:
     * int[] arr
     * int value
     *
     * Return type:
     * int[] restOfValuesArr
     *
     * 1. count how many times value appears in the given array (count)
     *      if index-0-value == givenValue
     *          count++
     *      if index-1-value == givenValue
     *          count++
     *          ..
     *      if index-last-value == givenValue
     *          count++
     * 2. create new array (restOfValuesArr) with length = arr.length - count
     * 3. put values in restOfValuesArr array except the value.
     */
    /*
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98 }
     */
    public int[] removedIntFromArray(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        // #2:
        int[] restOfValuesArr = new int[arr.length - count];
        // #3:
        int j=0;
        for (int num : arr) {
            if (num != value) {
                restOfValuesArr[j] = num;
                j++;
            }
        }
        return restOfValuesArr;
    }


    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0)
     * from given array.
     *
     * Example:
     * 	For array : {3, 5, 1, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array :
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     *
     */
    /**
     * Inputs: 1
     * int[]
     *
     * Return type:
     * int
     *
     * {3, 5, 1, 4, 2, 7}
     *
     * 1. sort
     * 2. remove number, if number < 1
     * 3. get rid off duplicates   {4, 7}
     * 4. check if 1 is present in array
     *      if present then ; if not then stop checking and declare 1 as smalledMissing
     *    check if 2 is present in array
     *      if present then ; if not then stop checking and declare 2 as smalledMissing
     */
    public int missingSmallest(int[] arr) {
        int check = 1;
        for (int i=0 ; i < arr.length ; i++) {
            if (arr[i] == check) {
                check++;
                i = -1;
            }
        }
        return check;
    }


    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user speed is such that system shows 12 points for a speed
     *      then print, license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */

}
