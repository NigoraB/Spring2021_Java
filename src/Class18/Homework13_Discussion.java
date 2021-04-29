package Class18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework13_Discussion {

    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        findDuplicatesInArray(words);
    }
        /**
         * Question 1:
         * Create a method that can find if the given array has any duplicate data or not?
         */


        /**
         * Question 2:
         * Create a method that would return the values occurring more than one time in given string-array
         *
         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         *
         */
    public static void findDuplicatesInArray(String[] givenArray) {
        /**
         * 1. List using givenArray
         * 2. List blank one
         * 3. Loop
         *      index-of-index-i != last-index-of-index-i && List doesn't contain the value
         *
         */
        List<String> fromArray = Arrays.asList(givenArray);
        // List<String> duplicates = new ArrayList<>();
        Set<String> duplicates = new HashSet<>();
        for (String value : fromArray) {
            if (fromArray.indexOf(value) != fromArray.lastIndexOf(value)) {
                duplicates.add(value);
            }
        }
        System.out.println("Duplicates --> " + duplicates);


    }

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

    /**
     * green = 22
     * red = 5
     * blue = 8
     * yellow = 8
     *
     */

    /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
}
