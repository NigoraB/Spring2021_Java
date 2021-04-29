package Class16.CollectionsPkg;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {

        /**
         * Limitations of Array:
         * 1. Total number of values that you need to store.
         *      int[] arr = new int[5];
         *      double[] dArr = new double[10];
         *      OR
         *    All the values that you want to store in array.
         *      int[] arr = {11, 22, 33, 44, 55};
         *
         * 2. Array length is fixed, we cannot increase/decrease the length of array in runtime.
         *
         * 3. Array can store only ONE datatype at one time.
         *
         */

        /**
         * Syntax to create ArrayList:
         *
         * ArrayList<datatypeClass> arrList = new ArrayList<>();
         *  OR
         * List<datatypeClass> myList = new ArrayList<>();
         *
         * int -> Integer   (Wrapper class : classes which represent the primitive datatypes)
         * double -> Double
         * char -> Character
         * String -> String
         * boolean -> Boolean
         *
         * List/ArrayList is a datatype which has store multiple values.
         * It maintains the order of insertion.
         *
         *
         */

        // Create a List/ArrayList which can store String values
        List<String> names = new ArrayList<>();
        List<Double> heights = new ArrayList<>();

        // Create an array which can store String values
        String[] sNames = new String[5];
        sNames[0] = "happy";

        System.out.println("Length of array:" + sNames.length);     // 5

        // Calculate length (or size) of ArrayList/List
        /**
         * method: size
         * to calculate the length of ArrayList
         * return type: int
         */
        int namesLength = names.size();
        System.out.println("names --> " + names);                   // []
        System.out.println("names length: " + namesLength);         // 0

        /**
         * method: add
         * to add data in arrayList. new data goes to the next available index
         *
         */
        names.add("hApPY");     // ["hApPY"]
        names.add("peace");     // ["hApPY", "peace"]
        names.add("joy");       // ["hApPY", "peace", "joy"]
        names.add("grow");      // ["hApPY", "peace", "joy", "grow"]
        names.add("peace");     // ["hApPY", "peace", "joy", "grow", "peace"]
        names.add("LearN");     // ["hApPY", "peace", "joy", "grow", "peace", "LearN"]

        System.out.println("\nnames --> " + names);                 // ["hApPY", "peace", "joy", "grow", "peace", "LearN"]
        System.out.println("names length: " + names.size());        // 6

        /**
         * method: remove
         * to remove the data from arrayList
         */
        /**
         * using index value
         * if the given index is found, java will remove the data and return it.
         * else IndexOutOfBoundsException
         *
         */
        String removedValue = names.remove(4);
        System.out.println("\nRemoved value from index-4: " + removedValue);

        System.out.println("\nnames --> " + names);                 // ["hApPY", "peace", "joy", "grow", "LearN"]
        System.out.println("names length: " + names.size());        // 5

        /**
         * using the data
         * if the given data is found, java will remove the first occurrence of it, and returns true
         * else returns false
         */
        boolean removed_happy = names.remove("happy");
        System.out.println("\nRemoved 'happy': " + removed_happy);

        System.out.println("\nnames --> " + names);                 // ["hApPY", "peace", "joy", "grow", "LearN"]
        System.out.println("names length: " + names.size());        // 5

        boolean removed_joy = names.remove("joy");
        System.out.println("\nRemoved 'joy': " + removed_joy);

        System.out.println("\nnames --> " + names);                 // ["hApPY", "peace", "grow", "LearN"]
        System.out.println("names length: " + names.size());        // 4

        List<Integer> allValues = new ArrayList<>();
        allValues.add(11);
        allValues.add(12);
        allValues.add(33);
        allValues.add(55);

        System.out.println("\n\nallValues --> " + allValues);
        // remove 12 from allValues
        System.out.println(allValues.remove(new Integer(12)));
        /*
                12, java is taking it as int, not Integer
                new Integer(12)
         */
        System.out.println("allValues --> " + allValues + "\n\n");

        /**
         * method: set
         * to replace the data at specific index
         * if the given index is found, java will replace the old-value with new-value and returns old-value
         * else IndexOutOfBoundsException
         */
        String replacedValue = names.set(1, "welCOMe");
        System.out.println("\nValue which got replaced from index-1 with 'welCOMe': " + replacedValue);

        System.out.println("\nnames --> " + names);                 // [hApPY, welCOMe, grow, LearN]
        System.out.println("names length: " + names.size());        // 4

        String replacedValue2 = names.set(2, "Reading");
        System.out.println("\nValue which got replaced from index-2 with 'Reading': " + replacedValue2);

        System.out.println("\nnames --> " + names);                 // [hApPY, welCOMe, Reading, LearN]
        System.out.println("names length: " + names.size());        // 4

        /*
            To retrieve value from array

            String[] arr = {hApPY, welCOMe, grow, LearN}

            print the value at index-2

            sout(arr[2]);

         */
        /**
         * method: get
         * to retrieve value from given index (to get the value from specific index)
         * if the given index is found, the value present at that index will be returned
         * else IndexOutOfBoundsException
         */
        String valueAt0 = names.get(0);
        System.out.println("\nValue at index-0: " + valueAt0);

        String valueAt1 = names.get(1);
        System.out.println("Value at index-1: " + valueAt1);

        System.out.println("\nnames --> " + names);                 // [hApPY, welCOMe, Reading, LearN]
        System.out.println("names length: " + names.size());        // 4




    }
}
