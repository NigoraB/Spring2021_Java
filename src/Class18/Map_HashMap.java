package Class18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {


        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        /**
         * green = 0
         * red = 5
         * blue = 8
         * yellow = 8
         *
         */

        /**
         * 1111 -> harry
         * 2222 -> john
         * 3333 -> nina
         * 4444 -> renne
         */

        /**
         *  10001   --> 443.87
         *  76678   --> 473483.98
         *  12345   --> 147848.87
         *
         *
         *  [ X, Y, Z, A]
         *  [ 11, 22, 33, 44]
         *
         *  {(A-B), (C,D) , (E,F)}
         *
         */

        /**
         * Map is an Interface, extends Collection Interface.
         * HashMap is a class which implements Map Interface.
         *
         * Map can store a (key-value) pair at every index.
         *
         * { (key->val) , (key->val) , (key->val) , (key->val) }
         * --> key is always UNIQUE in a Map.
         * --> Never maintains the order of insertion/addition
         *
         * Syntax:
         * Map<keyDatatypeClass, valueDatatypeClass> myMap = new HashMap<>();
         * OR
         * HashMap<keyDatatypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         *
         */

        /**
         * green = 0
         * red = 5
         * blue = 8
         * yellow = 8
         *
         * Map<String, Integer> colorCount = new HashMap<>();
         *
         */

        Map<String, Integer> colorCount = new HashMap<>();

        /**
         * to find the length/size fo Map
         * method: size()
         * return type: int
         */
        int colorCountSize = colorCount.size();
        System.out.println("colorCount size --> " + colorCountSize);    // 0
        System.out.println("colorCount --> " + colorCount);             // {}

        /**
         * to add key-value in Map
         * method: put
         *
         */
        colorCount.put("green", 10);
        colorCount.put("red", 21);
        colorCount.put("blue", 43);
        colorCount.put("orange", 12);
        colorCount.put("violet", 10);
        colorCount.put("pink", 65);
        colorCount.put("white", 7);
        colorCount.put("green", 11);
        colorCount.put("black", 10);

        System.out.println("\ncolorCount size --> " + colorCount.size());
        System.out.println("colorCount --> " + colorCount);

        /**
         * to remove data/pair from Map
         * method: remove
         */
        /**
         * by providing the key
         * if the key is found
         *      it will remove the pair
         *      return the associated value.
         * else
         *      return null
         * method: remove
         */
        Integer removed_White = colorCount.remove("white");                             // 7
        System.out.println("\nValue removed when removed 'white' : " + removed_White);

        Integer removed_abcd = colorCount.remove("abcd");                               // null
        System.out.println("Value removed when removed 'abcd' : " + removed_abcd);

        Integer removed_Black = colorCount.remove("Black");                             // null
        System.out.println("Value removed when removed 'Black' : " + removed_Black);

        System.out.println("\ncolorCount size --> " + colorCount.size());                    // 7
        System.out.println("colorCount --> " + colorCount);

        /**
         * by providing the key-value pair
         * if the key-value pair is found
         *      it will remove the pair
         *      return true
         * else
         *      return false
         * method: remove
         */
        boolean is_black_3_Removed = colorCount.remove("black", 3);                 // false
        System.out.println("\nis (black,0) removed : " + is_black_3_Removed);

        boolean is_pink_65_Removed = colorCount.remove("pink", 65);                 // true
        System.out.println("is (pink,65) removed : " + is_pink_65_Removed);

        boolean is_Red_21_Removed = colorCount.remove("Red", 21);                   // false
        System.out.println("is (Red,21) removed : " + is_Red_21_Removed);

        boolean is_green_0_Removed = colorCount.remove("green", 0);                 // false
        System.out.println("is (green,0) removed : " + is_green_0_Removed);

        System.out.println("\ncolorCount size --> " + colorCount.size());
        System.out.println("colorCount --> " + colorCount);

        /**
         * to find the value associated with key
         * method: get
         * if the given is found,
         *      returns the associated value
         * else
         *      returns null
         */
        Integer valueWith_green = colorCount.get("green");                      // 3
        System.out.println("\nValue with key - green: " + valueWith_green);

        Integer valueWith_bluE = colorCount.get("bluE");                        // null
        System.out.println("Value with key - bluE: " + valueWith_bluE);

        Integer valueWith_white = colorCount.get("white");                      // null
        System.out.println("Value with key - white: " + valueWith_white);

        System.out.println("\ncolorCount size --> " + colorCount.size());
        System.out.println("colorCount --> " + colorCount);

        /**
         * to find if the given data is present as one of the keys in Map
         * if the given data is present as one of the keys
         *      returns true
         * else
         *      returns false
         * method: containsKey()
         * return type: boolean
         */
        boolean is_green_key = colorCount.containsKey("green");                     // true
        System.out.println("\nis 'green' present as key?: " + is_green_key);

        boolean is_red_key = colorCount.containsKey("red");                         // true
        System.out.println("is 'red' present as key?: " + is_red_key);

        boolean is_violetn_key = colorCount.containsKey("violetn");                 // false
        System.out.println("is 'violetn' present as key?: " + is_violetn_key);

        boolean is_orang_key = colorCount.containsKey("orang");                     // false
        System.out.println("is 'orang' present as key?: " + is_orang_key);

        /**
         * to find if the given data is present as one of the Values in Map
         * if the given data is present as one of the Values
         *      returns true
         * else
         *      returns false
         * method: containsValue()
         * return type: boolean
         */
        boolean is_10_value = colorCount.containsValue(10);                      // true
        System.out.println("\nis '10' present as value?: " + is_10_value);

        boolean is_21_value = colorCount.containsValue(21);                      // true
        System.out.println("is '21' present as value?: " + is_21_value);

        boolean is_5_value = colorCount.containsValue(5);                        // false
        System.out.println("is '5' present as value?: " + is_5_value);

        /**
         * to get all keys in a variable
         * method: keySet()
         * return type: Set
         */
        Set<String> allKeys = colorCount.keySet();
        System.out.println("\nAll keys --> " + allKeys);

        /**
         * to get all values in a variable
         * method: values()
         * return type:
         */
        Collection<Integer> allValues = colorCount.values();
        System.out.println("\nAll values --> " + allValues);

        System.out.println("\ncolorCount size --> " + colorCount.size());
        System.out.println("colorCount --> " + colorCount);

        /**
         * to find if the Map is empty or not
         * method: isEmpty
         * return type: boolean
         */
        boolean is_colorCount_Empty = colorCount.isEmpty();
        System.out.println("\nis colorCount empty?: " + is_colorCount_Empty);
        System.out.println("colorCount size --> " + colorCount.size());
        System.out.println("colorCount --> " + colorCount);

        /**
         * to clear all data from Map or to empty Map
         * method: clear()
         */
        System.out.println("\nClearing the colorCount Map");
        colorCount.clear();

        boolean is_colorCount_Empty_afterClear = colorCount.isEmpty();
        System.out.println("\nis colorCount empty?: " + is_colorCount_Empty_afterClear);
        System.out.println("colorCount size --> " + colorCount.size());
        System.out.println("colorCount --> " + colorCount);
    }
}
