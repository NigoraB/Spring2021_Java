package Class10.LabSession;

import Class10.Homework9_Discussion;
import Class9.Homework9;

import java.util.Arrays;

public class LabSession2 {
    public static void main(String[] args) {

        double myBalance = Homework9_Discussion.balance;

        String titleStr = Homework9_Discussion.toTitlecase("happy");


        Homework9_Discussion h9 = new Homework9_Discussion();


        LabSession2 l2 = new LabSession2();
        String[] myWords = {"hapy" , "iamhaPpytoday", "great day", "hello world", "i am happy", "HAPPYness", "joyfulyhPPy", "king kong"};
        String wordToContain = "day";
        String[] result = l2.countRepeated(myWords, wordToContain);
        System.out.println("Names which contain '" + wordToContain + "' -> " + Arrays.toString(result));

        int len = 10;
        String[] result2 = l2.findNamesByLength(myWords, len);
        System.out.println("Names with length greater than " + len + " -> " +Arrays.toString(result2));
    }

    /**
     * Count the words which contains "Happy" in it from given array. (ignoring cases and happy can be in between as well)
     *
     * From the given array, give me words contain 'Happy' (ignoring cases)
     *
     * if no word contains 'happy' --> "none"
     * if 1 word contains 'happy' --> word
     * if 2 or more words contain 'happy' --> all the words which happy
     *
     *
     * name: countRepeated
     * input: 1 (String[])
     * return type: String[]
     */
     /**
     *
     * {"happy" , "iamhappytoday", "great day", "hello world", "i am happy", "HAPPYness", "joyfulyhaPPy"}
     * 1. count of words contain 'happy' (ignore cases)
     * 2. create String array using above count
     * 3. from given array, if word contains happy, store in resultWords array
     *
     * pick index-0
     * if contains 'happy'
     *      put in the resultWords
     */
    public String[] countRepeated (String[] words, String wordToFind) {
        int count = 0;
        String[] resultWords = null;
        for (String word : words) {
            if (word.toLowerCase().contains(wordToFind.toLowerCase())) {
                count++;
            }
        }
        if (count > 0 ) {
            resultWords = new String[count];
            int j = 0;
            for (String word : words) {
                if (word.toLowerCase().contains(wordToFind.toLowerCase())) {
                    resultWords[j] = Homework9_Discussion.toTitlecase(word);
                    j++;
                }
            }
        } else {
            resultWords = new String[1];
            resultWords[0] = "none";
        }
        // System.out.println(Arrays.toString(resultWords));
        return resultWords;

    }

    /**
     * In given array, find the names with length greater than user given length
     *
     * name: findNamesByLength
     * inputs: String[], int
     * return type: String[]
     *
     */
    /**
     * {"happy" , "iamhappytoday", "great day", "hello world", "i am happy", "HAPPYness", "joyfulyhaPPy", "king kong"} , 8
     *
     * 1. count the names with length greater than userGivenLength(8) --> 5
     * 2. create a string array to store 5 values
     * 3. store names with length > 8, in step2-Array
     *
     */
    public String[] findNamesByLength(String[] names, int shouldBeGreaterThan) {
        int count = 0;
        for (int i=0; i < names.length; i++) {
            if (names[i].length() > shouldBeGreaterThan) {
                count++;
            }
        }
        String[] resultNames = new String[count];
        int j=0;
        for (String name : names) {
            if (name.length() > shouldBeGreaterThan) {
                resultNames[j] = name;
                j++;
            }
        }
        return resultNames;
    }


}
