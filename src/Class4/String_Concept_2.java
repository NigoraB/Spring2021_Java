package Class4;

import java.util.Arrays;

public class String_Concept_2 {
    public static void main(String[] args) {

        String cityName = "New YoRk";   // 8

        /**
         * to find if a particular sequence is present in the string
         * Method: contains()
         * Returns: boolean
         */
        boolean isContains_new = cityName.contains("new");      // false
        System.out.println("does '" + cityName + "' contain 'new'? : " + isContains_new);

        /**
         * Task: verify if cityName (nEw YoRk) contains 'nEw'
         * Note: Pls ignore cases.
         * Expected ans: true
         *
         */
        /*
            Pseudo Coding
            1. convert cityName in lowercase using toLowercase
            2. convert contains string in lowercase
            3. use contains method
         */
        String cityNameLowercase = cityName.toLowerCase();
        String findThis = "NEW";
        findThis = findThis.toLowerCase();
        boolean isContains_IgnoringCases = cityNameLowercase.contains(findThis);

        /**
         * To replace in string
         * Method: replace
         *
         * It will replace all instances.
         * This method will NOT change the original value,
         * it will replace the data, and returns a new String
         */

        // String cityName = "New YoRk";
        String cityNameReplace_Y_Z = cityName.replace('Y', 'Z');
        System.out.println("\nCityName : " + cityName);
        System.out.println("CityName after replace Y with Z : " + cityNameReplace_Y_Z);

        String cityNameReplaceMultiple =  cityName.replace("w Y", "-Hello-");
        System.out.println("\nCityName : " + cityName);
        System.out.println("CityName after replace multiple : " + cityNameReplaceMultiple);

        // String res = cityName.replace("new", "NEW");
        // System.out.println("res ---> " + res);  //

        /**
         * to find the char present at given index
         * Method: charAt()
         * Return: char
         *
         *
         * cityName = "New YoRk"
         *
         * N  e  w     Y  o  R  k
         * 0  1  2  3  4  5  6  7   (len=8)
         *
         * length = 8
         * last Index = 7
         *
         * If given index is within the index-range, it will return the char at given index
         * else, it will throw Exception (StringIndexOutOfBoundsException)
         *
         */
        char charAtIndex4 = cityName.charAt(4);
        System.out.println("\nIn '" + cityName + "' char at index-4: " + charAtIndex4);


        /*char charAtIndex10 = cityName.charAt(10);
        System.out.println("\nIn '" + cityName + "' char at index-10: " + charAtIndex10);*/

        /**
         * Task: Write a code to print the char present at last index of the string.
         * String hello = "Hello World";
         *
         * // code
         * 1. find the length of string
         * 2. Using the length value, calculate the last index (lastIndex = length - 1)
         * 3. Using charAt method, we can find the char present at last index
         */
        String hello = "Hello World";
        int len = hello.length();
        int lastIndex = len - 1;
        char lastIndexChar = hello.charAt(lastIndex);
        System.out.println("Char at last Index in '" + hello+ "' : " + lastIndexChar);

        /**
         *
         * // cityName : "New york City IN the ToWN"
         *
         * To find the index of given value (FIRST occurrence)
         * Method: indexOf()
         * Returns: int
         *
         * if the given value found,
         *      will return the index of the FIRST occurrence of the given value.
         * else
         *  return -1
         */
        cityName = "new york City IN the ToWN";
        int indexOfN = cityName.indexOf("N");   // 15
        System.out.println("\nIndex of 'N' in '" + cityName + "' is : " + indexOfN);

        int indexOf_Word = cityName.indexOf("or");   // 5
        System.out.println("Index of 'or' in '" + cityName + "' is : " + indexOf_Word);

        int indexOf_Z = cityName.indexOf("Z");   // -1
        System.out.println("Index of 'Z' in '" + cityName + "' is : " + indexOf_Z);


        /**
         * to find the index of LAST occurrence of the given value
         * Method: lastIndexOf()
         * Returns: int
         *
         * if the given value found,
         *      will return the index of the LAST occurrence of the given value.
         * else
         *  return -1
         */
         cityName = "New york City IN the ToWN of the UNited STates of American";
         int lastIndexOfN = cityName.lastIndexOf("N");
         System.out.println("\nLast index of 'N' in '" + cityName + "' is : " + lastIndexOfN);

        int lastIndexOf_P = cityName.lastIndexOf("P");
        System.out.println("Last index of 'P' in '" + cityName + "' is : " + lastIndexOf_P);

        /**
         * To find if the the string starts with given value
         * Method: startsWith()
         * Returns: boolean
         *
         */
        cityName = "nEw YoRK CitY";
        boolean isCityNameStartsWith_ne = cityName.startsWith("ne");  // false
        System.out.println("\ndoes '" + cityName + "' start with 'ne'? : " + isCityNameStartsWith_ne);

        boolean isCityNameStartsWith_nEwY = cityName.startsWith("nEw Y");  // true
        System.out.println("does '" + cityName + "' start with 'nEw Y'? : " + isCityNameStartsWith_nEwY);

        /**
         * To find if the the string ends with given value
         * Method: endsWith()
         * Returns: boolean
         *
         * // cityName = "nEw YoRK CitY";
         */
        boolean isCityNameEndsWith_wN  = cityName.endsWith("wN");   // false
        System.out.println("\ndoes '" + cityName + "' end with 'wN'? : " + isCityNameEndsWith_wN);
        boolean isCityNameEndsWith_tY  = cityName.endsWith("tY");   // true
        System.out.println("does '" + cityName + "' end with 'wN'? : " + isCityNameEndsWith_tY);

        /**
         * To remove spaces from the beginning (before the first character)
         *  and from the end (after the last character) from a String
         *
         * method: trim()
         *
         * This method will NOT change the original value,
         *  it will removes extra spaces and return new string.
         *
         */
        cityName = "     New york    City     IN the ToWN     of the   UNited       STates of American       .         ";
        String cityNameTrim = cityName.trim();
        System.out.println("\n#" + cityName + "#");
        System.out.println("#" + cityNameTrim + "#");


        /**
         * To fetch a portion from String using index values
         * Method: subString()
         * Returns: String
         *
         * "New york city in the town"
         *
         * give me string from index 1 to 4 --> "ew "   // 1,2,3
         *
         * give me string from index 1 --> "ew york city in the town"
         *
         * Input is only beginIndex:
         *      if beginIndex is valid (within the index-range)
         *          returns string from beginIndex to end of the string.
         *      else
         *          StringOutOfBoundsException
         *
         * Input is beginIndex and endIndex:
         *      if beginIndex and endIndex are valid (within the index-range)
         *          returns string from beginIndex to endIndex-1.
         *      else
         *          StringOutOfBoundsException
         *
         *
         * PS: It will NOT change the original string value.
         *
         */
        cityName = "New york city in the town";
        String cityName_1To5 = cityName.substring(1,5);    // "ew y"
        System.out.println("\ncityName : " + cityName);
        System.out.println("cityName_1To5 : " + cityName_1To5);

        String cityNameFrom10 = cityName.substring(10);     // "ity in the town"
        System.out.println("\ncityName : " + cityName);
        System.out.println("cityNameFrom10 : " + cityNameFrom10);


//        String cityName_1To60 = cityName.substring(1,60);
//        System.out.println("\ncityName : " + cityName);
//        System.out.println("cityName_1To60 : " + cityName_1To60);

        /**
         * "New york city in the town"
         *
         * to cut the string value from a specific point into multiple string values
         * Method: Split()
         * Returns: String[]
         *
         */
        cityName = "New york city in the town";

        String[] afterSplitBy_o = cityName.split("o");
        System.out.println("\ncityName :  " + cityName);
        // System.out.println("Array after split (direct variable): " + afterSplitBy_o);
        // shortcut to print Array values
        System.out.println("Array after split by 'o': " + Arrays.toString(afterSplitBy_o));


        String[] afterSplitBy_space = cityName.split(" ");  // ["New" , "york", "city", "in", "the", "town]
        System.out.println("Array after split by space :  " + Arrays.toString(afterSplitBy_space));

        String[] afterSplitBy_Nothing = cityName.split(""); // Array with every character at each index
        // "N" , "e", "w", " ", "y" ....
        System.out.println("Array after split by nothing : " + Arrays.toString(afterSplitBy_Nothing));


    }
}
