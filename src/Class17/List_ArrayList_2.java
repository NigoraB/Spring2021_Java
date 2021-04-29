package Class17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ArrayList_2 {
    public static void main(String[] args) {

        String[] words = {"happy", "peaceful", "nice", "world", "begin", "learn"};

        // create a code to store all the values from words-array into ArrayList (wordsList)
//        wordsList.add(words[0]);    // i=0
//        wordsList.add(words[1]);    // i=1
//        wordsList.add(words[2]);
//        wordsList.add(words[3]);
//        wordsList.add(words[4]);
//        wordsList.add(words[5]);

//        List<String> wordsList1 = new ArrayList<>();
//        for (int i=0 ; i < words.length ; i++) {
//            wordsList1.add(words[i]);
//        }
//        System.out.println("wordsList1 --> " + wordsList1);
//
//        List<String> wordsList2 = new ArrayList<>();
//        for (String word : words) {
//            wordsList2.add(word);
//        }
//        System.out.println("wordsList2 --> " + wordsList2);
//
//        List<String> wordsList3 = Arrays.asList(words);
//        System.out.println("wordsList3 --> " + wordsList3);


        List<String> names = new ArrayList<>();
        names.add("hApPY");     // ["hApPY"]
        names.add("peace");     // ["hApPY", "peace"]
        names.add("joy");       // ["hApPY", "peace", "joy"]
        names.add("grow");      // ["hApPY", "peace", "joy", "grow"]
        names.add("peace");     // ["hApPY", "peace", "joy", "grow", "peace"]
        names.add("LearN");     // ["hApPY", "peace", "joy", "grow", "peace", "LearN"]
        names.add("joy");
        names.add("peace");
        names.add("happy");
        names.add("joy");
        names.add("world");

        System.out.println("names --> " + names);   // names --> [hApPY, peace, joy, grow, peace, LearN, joy, peace, happy, joy, world]

        /**
         * method: indexOf
         * to find the index of any given value
         * if the given value is found
         *      returns the index of FIRST OCCURRENCE of given value
         * else
         *      returns -1
         */
        int indexOf_Joy = names.indexOf("Joy");
        System.out.println("Index of 'Joy' in names --> " + indexOf_Joy);       // -1

        int indexOf_grow = names.indexOf("grow");
        System.out.println("Index of 'grow' in names --> " + indexOf_grow);     // 3

        int indexOf_joy = names.indexOf("joy");
        System.out.println("Index of 'joy' in names --> " + indexOf_joy);       // 2

        int indexOf_row = names.indexOf("row");
        System.out.println("Index of 'row' in names --> " + indexOf_row);       // -1

        System.out.println("names --> " + names);


        System.out.println("names --> " + names);   // names --> [hApPY, peace, joy, grow, peace, LearN, joy, peace, happy, joy, world]
        /**
         * method: lastIndexOf
         * to find the LAST index of any given value
         * if the given value is found
         *      returns the index of LAST OCCURRENCE of given value
         * else
         *      returns -1
         */
        int lastIndexOf_joy = names.lastIndexOf("joy");         // 9
        System.out.println("Last Index of 'joy' in names --> " + lastIndexOf_joy);

        int lastIndexOf_peace = names.lastIndexOf("peace");     // 7
        System.out.println("Last Index of 'peace' in names --> " + lastIndexOf_peace);

        int lastIndexOf_grow = names.lastIndexOf("grow");     // 3
        System.out.println("Last Index of 'grow' in names --> " + lastIndexOf_grow);

        int lastIndexOf_skill = names.lastIndexOf("skill");     // -1
        System.out.println("Last Index of 'skill' in names --> " + lastIndexOf_skill);

        // Write code to confirm if 'grow' is appearing on only once in the list
        int indexOfgrow = names.indexOf("grow");
        int lastIndexOfgrow = names.lastIndexOf("grow");

        if (indexOfgrow == lastIndexOfgrow) {
            System.out.println("Grow is appearing only once");
        } else {
            System.out.println("Grow is appearing more than one time");
        }

        // Another way
        /*
            growCount = 0
            add 1 to growCount, when 'grow' is found at an index

            pick index-0-value
            if (index-0-value is equal to 'grow)
                growCount++
            if (index-1-value is equal to 'grow)
                growCount++
            if (index-2-value is equal to 'grow)
                growCount++
                ...
                ...
            if (index-lastIndex-value is equal to 'grow)
                growCount++
         */
        // names --> [hApPY, peace, joy, grow, peace, LearN, joy, peace, happy, joy, world]
        int growCount = 0;
        for (int i=0 ; i < names.size() ; i++) {
            if (names.get(i).equalsIgnoreCase("king")) {
                growCount++;
            }
        }
        if (growCount == 1) {
            System.out.println("Grow is appearing only once");
        } else if (growCount > 1) {
            System.out.println("Grow is appearing "+ growCount+" times");
        } else {
            System.out.println("Grow is not present in the given list");
        }

        /**
         * method: contains
         * to find out if the given value is present in list or not.
         * OR to find out if in the given list contains the given value
         *
         * return type: boolean
         */
        boolean isContains_ace = names.contains("ace");
        System.out.println("is names contains 'ace' : " + isContains_ace);      // false

        boolean isContains_JOY = names.contains("JOY");
        System.out.println("is names contains 'JOY' : " + isContains_JOY);      // false

        boolean isContains_happy = names.contains("happy");
        System.out.println("is names contains 'happy' : " + isContains_happy);  // true


        /**
         * method: isEmpty()
         * if list is empty, returns true
         * else returns false
         * return type: boolean
         */
        boolean isNamesEmpty = names.isEmpty();
        System.out.println("\nis names empty? : " + isNamesEmpty);
        System.out.println("names --> " + names);
        System.out.println("names length: " + names.size());

        /**
         * method: clear()
         * return type: void
         *
         * to clear (or empty) the arraylist/list
         */
        System.out.println("\nClearing the arrayList");
        names.clear();

        boolean isNamesEmpty_afterClear = names.isEmpty();
        System.out.println("\nis names empty? : " + isNamesEmpty_afterClear);
        System.out.println("names --> " + names);
        System.out.println("names length: " + names.size());


        /**
         * Array limitation #3: Array can store only ONE datatype at one time.
         *
         */
        List<Object> anyDatatypeList = new ArrayList<>();
        anyDatatypeList.add("usa");     // Object "usa"
        anyDatatypeList.add(true);      // Object true
        anyDatatypeList.add(101);       // Object 101
        anyDatatypeList.add(1.1);       // Object 1.1
        anyDatatypeList.add('a');       // Object 'a'

    }
}
