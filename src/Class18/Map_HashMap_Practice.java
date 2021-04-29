package Class18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_Practice {
    public static void main(String[] args) {

        Map<String, Integer> colorCount = new HashMap<>();

        colorCount.put("green", 10);
        colorCount.put("red", 21);
        colorCount.put("blue", 43);
        colorCount.put("orange", 12);
        colorCount.put("violet", 10);
        colorCount.put("pink", 65);
        colorCount.put("white", 7);
        colorCount.put("black", 10);

        printKeyWithCondition(colorCount);

        // add2Ints(10, 20);

    }

    /**
     * print the key which has value greater than 8 and less than 21
     *
     * green
     * orange
     * violet
     * black
     *
     * Method:
     * name: printKeyWithCondition
     * return type: void / List<string> / Set<String>
     *
     */
    public static void printKeyWithCondition(Map<String, Integer> givenMap) {
        /*
            get all keys in a variable (keySet) --> ["green", "red", "blue" , "yellow"]
            pick the key-name
                find the associated value (get)
                if associated value is greater than 8 and less than 21
                    pint the key
         */

        Set<String> allKeys = givenMap.keySet();
        for (String key : allKeys) {
            Integer val = givenMap.get(key);
            if (val > 8 && val < 21) {
                System.out.println(key);
            }
        }


    }


    public static void add2Ints(int a, int b) {

    }


}
