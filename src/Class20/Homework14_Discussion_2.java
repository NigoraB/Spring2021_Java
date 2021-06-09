package Class20;

import java.util.*;

public class Homework14_Discussion_2 {

    public static void main(String[] args) {
        String[] words = {"happy", "peace", "HAppY", "joy", "grow", "joy", "laugh", "haPPy", "laugh", "joy"};
        List<String> wordsList = Arrays.asList(words);
        // findDuplicatesWithCount(wordsList);

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green", "yellow", "grey", "yellow", "grey", "yellow", "grey", "yellow", "grey", "yellow", "grey", "yellow", "grey"};
        findColorWithCount(arr);

    }

        /**
         * Question 1:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "HAppY", "joy", "grow", "joy", "laugh", "haPPy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         */
    public static Map<String, Integer> findDuplicatesWithCount(List<String> myList) {
        Map<String, Integer> duplicates = new HashMap<>();

        for (int i=0 ; i < myList.size() ; i++) {
            int count = 1;
            for (int j=i+1 ; j < myList.size() ; j++) {
                if (myList.get(i).equalsIgnoreCase(myList.get(j))) {
                    count++;
                }
            }
            if (!duplicates.containsKey(myList.get(i).toLowerCase()) && count > 1) {
                duplicates.put(myList.get(i).toLowerCase(), count);
            }
        }
        return duplicates;
    }


        /**
         * Question 2:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value, else "All keys have different values"
         *
         * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
         * Output (print) ->
         *      "happy" with keys -> 101, 103, 106
         *      "peace" with keys -> 102, 105
         *
         * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
         * Output (print) ->
         *      All keys have different values
         */
    /**
     *
     *
        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(890, "grow");
        ssnData.put(1111, "grow");
        ssnData.put(104, "live");
        ssnData.put(1000, "Peace");

     [
        {"happy" [101]} ,
        {"very happy" [102]} ,
        {"grow" [890, 1111]} ,
        {"live" [104]} ,
        {"peace" [1000]}
     ]

        "grow" with keys -> 890, 1111

     * 1. get all values in a variable
     * 2. get all keys in a variable
     * 3. creating Set<String> to store result.
     * 4. Loop using values --> entering all values in a Set (from #3)
     * 5. Creating Map<String, List<Integer>> to store
     * 6. Loop using keys
     *      Creating a List<Integer>
     *      Loop using keys
     *          Entering data in Map (#5) where String is key and List<Integer>
     * 7. C
     */

    /*
           1. get all keys in a variable  [101, 102, 890, 1111, 104, 1000]
           2. create a Set<Integer> to store keys with same value.
           3. Loop using keys
                Clear the Set created on #2
                v101
                    v102
                    if (v101.equalsIgnoreCase(v102))
                      add 101,102 in Set(#2)
                    v890
                    if (v101.equalsIgnoreCase(v890))
                      add 101,890 in Set(#2)
                    v1111
                    if (v101.equalsIgnoreCase(v1111))
                      add 101,1111 in Set(#2)
                    ....
                    ....
                    v1000
                    if (v101.equalsIgnoreCase(v1000))
                      add 101,1000 in Set(#2)

                    if (Set size is > 0)
                        sout(v101 with keys -> Set<Integer>);

                v102
                    v890
                    if (v102.equalsIgnoreCase(v890))
                      add 102,890 in Set(#2)
                    v1111
                    if (v102.equalsIgnoreCase(v1111))
                      add 102,1111 in Set(#2)
                    ....
                    ....
                    v1000
                    if (v102.equalsIgnoreCase(v1000))
                      add 102,1000 in Set(#2)

                    if (Set size is > 0)
                        sout(v101 with keys -> Set<Integer>);


     */



    String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green", "yellow", "grey", "yellow", "grey", "yellow", "grey", "yellow", "grey"};

    public static List<String> findColorWithCount(String[] colorArray) {
        Map<String, Integer> duplicates = new HashMap<>();

        for (int i=0 ; i < colorArray.length ; i++) {
            int count = 1;
            for (int j=i+1 ; j < colorArray.length ; j++) {
                if (colorArray[i].equalsIgnoreCase(colorArray[j])) {
                    count++;
                }
            }
            if (!duplicates.containsKey(colorArray[i].toLowerCase()) && count > 1) {
                duplicates.put(colorArray[i].toLowerCase(), count);
            }
        }
        System.out.println(duplicates);
        Collection<Integer> allValues = duplicates.values();    // 3, 9, 4, 5, 5
        int maxColorCount = findMax(allValues);
        List<String> colorWithMaxCount = new ArrayList<>();
        for (String color : duplicates.keySet()) {
            if (duplicates.get(color) == maxColorCount) {
                colorWithMaxCount.add(color);
            }
        }
        return colorWithMaxCount;
    }

    public static int findMax(Collection<Integer> myCollection) {
        Object[] valuesObjects = myCollection.toArray();
        Object maxValue = valuesObjects[0];
        for (int i=1 ; i < valuesObjects.length ; i++) {
            if (Integer.valueOf(maxValue.toString()) < Integer.valueOf(valuesObjects[i].toString())) {
                maxValue = valuesObjects[i];
            }
        }
        return Integer.valueOf(maxValue.toString());
    }
        /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
}
