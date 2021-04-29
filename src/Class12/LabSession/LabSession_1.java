package Class12.LabSession;

import Class12.AccessModifier.AccessModifier_Concept;

import java.util.Arrays;

public class LabSession_1 {


    public static void main(String[] args) {

        System.out.println("Hello");


        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println("Given sentence : " + sentence3);     // happy holidays

        String[] split_sentence3 = sentence3.trim().split(""); // [h,a,p,p,y," ", h.....]

        for (int i=0 ; i< split_sentence3.length; i++){
            reverseSentence3= reverseSentence3 + split_sentence3[split_sentence3.length-1-i];
        }

        System.out.println("Reversed sentence : " + reverseSentence3); // question: why cant i get "s" printed?


    }

    /**
     * Return the length of all names given by user
     *
     * input (String[]) : {"happy", "happiness", "joy", "give"}
     *
     * output (int[]) : 5, 9, 3, 4
     */
//    public int[] findNamesLength(String[] names) {
//        // code
//    }


    /**
     * Find the max number from given int array:
     *
     * input: int[]
     * output: int
     *
     * int[] numbers = {90, 89, 91, 67, 87, 88, 93, 90, 110, 81, 54};
     * 110
     *
     * int[] numbers = {-90, -89, -91};     //
     *
     */
    public int findMaxNumber(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    public int findMaxNumber2(int[] numbers) {
        int max = numbers[0];
        for (int findMax : numbers) {
            if (max < findMax) {
                max = findMax;
            }
        }
        return max;
    }

    /**
     * Write a method to read a string and
     * returns after removing the # and its immediate left and right characters.
     *
     * The given strings is : test#string
     * Method should return : testring
     */

    /**
     * Given the school Data
     * student names : {"happy", "happiness", "joy", "give"}
     * student scores : {90, 89, 91, 97}
     *
     * write a method to return the name of the student who scored max marks.
     *
     */

    /**
     * Sort a given int array
     *
     * int[] --> [20, 10, 44, 40]
     *
     * int[] --> [10, 20, 40, 44]
     *
     */




}
