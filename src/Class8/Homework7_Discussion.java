package Class8;

import java.util.HashMap;

public class Homework7_Discussion {
    public static void main(String[] args) {
        // Due: Mar 18, 2021

        /**
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        String sentence1 = "hApPY nEW yeAr to aLl of YoU";
        System.out.println("Original string: " + sentence1);  // hApPY nEW yeAr
        // code
        String[] sentence1Array = sentence1.split(" ");     // ["hApPY" , "nEW" , "yeAr"]
        sentence1 = "";

        /*
        sentence1 = sentence1 + sentence1Array[0].substring(0,1).toUpperCase() + sentence1Array[0].substring(1).toLowerCase() + " ";  // Happy
        sentence1 = Happy

        sentence1 = sentence1 + sentence1Array[1].substring(0,1).toUpperCase() + sentence1Array[1].substring(1).toLowerCase() + " ";  // New
        sentence1 = Happy New

        sentence1 = sentence1 + sentence1Array[2].substring(0,1).toUpperCase() + sentence1Array[2].substring(1).toLowerCase() + " ";  // Year
        sentence1 = Happy New Year

        */
//        for (int i = 0; i < sentence1Array.length; i++) {
//            sentence1 = sentence1 + sentence1Array[i].substring(0, 1).toUpperCase() + sentence1Array[i].substring(1).toLowerCase() + " ";
//        }
//
//        for (String word : sentence1Array) {
//            sentence1 = sentence1 + word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
//        }

        sentence1 = sentence1.trim();

        System.out.println("Formatted string: " + sentence1);  // Happy New Year


        /**
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String sentence2 =  "Lab sessIONS clAsses";
        String abr = "";

        String[] sentence2Array = sentence2.split(" ");     // ["Lab" , "sessIONS" , "clAsses"]

        abr = abr + sentence2Array[0].substring(0,1).toUpperCase();     // L
        abr = abr + sentence2Array[1].substring(0,1).toUpperCase();
        abr = abr + sentence2Array[2].substring(0,1).toUpperCase();

//        for (int i=0 ; i< sentence2Array.length ; i++) {
//            abr = abr + sentence2Array[i].substring(0,1).toUpperCase();     // abr = abr + sentence2Array[i].substring(0,1).toUpperCase();
//        }
//
//        for (int i=0 ; i< sentence2Array.length ; i++) {
//            if (i == 0) {
//                abr = sentence2Array[i].substring(0,1).toUpperCase();
//            } else {
//                abr = abr + sentence2Array[i].substring(0, 1).toUpperCase();
//            }
//        }
//
//        for (String word : sentence2Array) {         // ["Lab" , "sessIONS" , "clAsses"]
//            abr = abr + word.substring(0,1).toUpperCase();
//        }

        System.out.println("Abbreviation: " + abr);


        int[] numbers = {11, 22, 33, 44, 55};
        /*
            print even numbers from this array
         */

//        for (int i=0 ; i<numbers.length ; i++) {
//            if (numbers[i] % 2 == 0) {
//                System.out.println(numbers[i] + ", ");
//            }
//        }
//
//        for (int num : numbers) {       // {11, 22, 33, 44, 55}
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//        }


        /**
         * Reverse a string
         *
         */
        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println("sentence3 : " + sentence3);     // happy holidays
            // code
        String[] sentence3Array = sentence3.split("");      // ["h", "a", "p", "p", "y", " ", "h", "o", "l", "i", "d", "a", "y", "s"]
        /*
        reverseSentence3 = reverseSentence3 + sentence3Array[sentence3Array.length-1];       // s     i =
        reverseSentence3 = reverseSentence3 + sentence3Array[sentence3Array.length-2];     // sy
        reverseSentence3 = reverseSentence3 + sentence3Array[sentence3Array.length-3];       // sya
        ..
        ..
        reverseSentence3 = reverseSentence3 + sentence3Array[0];     // sy
         */

        for (int i=1 ; i <= sentence3Array.length ; i++) {
            reverseSentence3 = reverseSentence3 + sentence3Array[sentence3Array.length-i];
        }

        for (int i = sentence3Array.length-1 ; i >= 0 ; i--) {
            reverseSentence3 = reverseSentence3 + sentence3Array[i];
        }

        System.out.println("Reverse sentence3 : " + reverseSentence3);  // syadiloh yppah


        String inputString = "I am the best of bests";
        String reverseString = "";
        int stringLength = inputString.length();
        String[] inputStringArray = inputString.trim().split(" ");
        for (int i = inputStringArray.length-1 ; i >= 0 ; i--) {
            reverseString = reverseString + inputStringArray[i] + " ";
        }
        System.out.println(reverseString.trim());

        findLongestSubstring("abcdefghedijaklkijghgstdgdgdgd");

    }


    public String reverseString(String inputString) {
        String reverseString = "";
        int stringLength = inputString.length();
        String[] inputStringArray = new String[stringLength];
        for (int i = inputStringArray.length-1 ; i >= 0 ; i--) {
            reverseString = reverseString + inputStringArray[i];
        }
        return reverseString;
    }

    public static String findLongestSubstring(String str)
    {
        int i;
        int n = str.length();

        int st = 0, currlen = 0, maxlen = 0, start = 0;

        HashMap<Character, Integer> pos = new HashMap<>();

        pos.put(str.charAt(0), 0);

        for (i = 1; i < n; i++) {
            if (!pos.containsKey(str.charAt(i))) {
                pos.put(str.charAt(i), i);
            } else {
                if (pos.get(str.charAt(i)) >= st) {
                    currlen = i - st;
                    if (maxlen < currlen) {
                        maxlen = currlen;
                        start = st;
                    }
                    st = pos.get(str.charAt(i)) + 1;
                }
                pos.replace(str.charAt(i), i);
            }
        }
        if (maxlen < i - st) {
            maxlen = i - st;
            start = st;
        }
        System.out.println(str.substring(start, start + maxlen));
        return str.substring(start, start + maxlen);
    }

}
