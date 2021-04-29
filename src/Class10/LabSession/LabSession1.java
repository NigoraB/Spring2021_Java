package Class10.LabSession;

import Class10.Homework9_Discussion;
import Class9.ClassObject_and_Method_Concept;

import java.util.Arrays;

public class LabSession1 {

    /**
     * Write methods to give the name which has the max length.
     *
     * name: getNameMaxLength
     * inputs: 1 (String[])
     * return type: String[]
     *
     * "pEace", "HappiNess", "GIvE", "SoDiUM"
     *
     * 1. create int[]
     * 2. store names length in int[] ({5, 9, 4, 6})
     * 3. find max in int[] (9)
     * 4. count the String with length equal to maxlength
     * 5. use count to create String[]
     *
     * 1. count the names with max length
     * 2. create String[] with the count value
     * 3. store all names in step-2 String[], where nameLength is equal to maxLength
     *
     *
     * int countName = 0
     *
     * picked index-0 name
     * len = 5
     * nameWithMaxLength = 5
     *
     * picked index-1 name
     * len = 9
     * if (nameWithMaxLength >=  len)
     *  nameWithMaxLength = 9
     *  countName++
     *
     * picked index-2 name
     * len = 4
     * if (nameWithMaxLength >=  len)
     *  nameWithMaxLength = 9
     *  countName++
     *
     * picked index-3 name
     * len = 6
     * if (nameWithMaxLength >=  len)
     *  nameWithMaxLength = 9
     *  countName++
     *
     *
     * String[] maxLenNames = new String[countName]
     *
     *
     * 1.
     *
     *
     *
     *
     *
     */
    // {"pEace", "happi", "GIvEs", "SODiuM"};   // Sodium
    public String[] getNameMaxLength (String[] names) {
        int count = 1, nameWithMaxLength = names[0].length();

        for (int i=1 ; i < names.length ; i++) {
            int len = names[i].length();
            if (len == nameWithMaxLength) {
                count++;
            } else if (len > nameWithMaxLength) {
                count = 1;
                nameWithMaxLength = len;
            }
        }

        String[] longestNames = new String[count];

        int j=0;
        for (String name : names) {
            if (name.length() == nameWithMaxLength) {
                longestNames[j] = Homework9_Discussion.toTitlecase(name);
                j++;
            }
        }
        return longestNames;

    }

    /*
     * 1. create int[]
     * 2. store names length in int[] ({5, 9, 4, 6})
     * 3. find max in int[] (9)
     * 4. count the String with length equal to maxlength
     * 5. use count to create String[]
     */
    public static String[] getNameMaxLength2 (String[] names) {
        int[] lengthOfNames = new int[names.length];
        for (int i=0;i< names.length;i++) {
            lengthOfNames[i] = names[i].length();
        }
        // System.out.println(Arrays.toString(lengthOfNames));
        int maxLength = getMaxValue(lengthOfNames);
        // System.out.println("Max Length --> " + maxLength);
        int count = 0;
        for (String name : names) {
            if (name.length() == maxLength) {
                count++;
            }
        }
        // System.out.println("Counter --> " + count);
        String[] longestNames = new String[count];
        // {"pEace", "happi", "GIvEs", "Soduim", "aaaaaa"};
        int j=0;
        for (String name : names) {
            if (name.length() == maxLength) {
                longestNames[j] = Homework9_Discussion.toTitlecase(name);
                j++;
            }
        }
        // System.out.println(Arrays.toString(longestNames));
        return longestNames;

    }

    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        LabSession1 lb1 = new LabSession1();

        String[] allNames = {"pEace", "happiness", "Gives", "So", "aaa"};

        String[] resultNames = lb1.getNameMaxLength(allNames);
        System.out.println(Arrays.toString(resultNames));


        String[] resultNames2 = getNameMaxLength2(allNames);
        System.out.println(Arrays.toString(resultNames2));

    }

    /**
     * arr1 = {"pEace", "happiness", "Gives", "So", "aaa"};
     * arr2 = {"pEace", "HappiNess", "joy", "give", "AAA", "enjoy", "learN};
     *
     * input: String[], String[]
     * return type: String[]
     *
     * you need to find the common words (ignoring cases) in the two given array.
     * "Peace", "Happiness", "Aaa"
     *
     */

    /**
     * arr1 = {"pEace", "HappiNess", "joy", "give", "AAA", "enjoy", "learN};                     --> All Unique
     * arr1 = {"pEace", "HappiNess", "peace", "give", "LEArn", "aaa", "PEACE", "learN};          --> Peace
     * arr1 = {"pEace", "LearN", "peace", "give", "LEArn", "aaa", "PEACE", "learN"};             --> Peace, Learn
     *
     *
     * input: String[]
     * return type: String[]
     *
     *
     *
     * Find the words appearing max number of times in an array
     * if all words are unique, answer should be "All Unique"
     * if one words is appearing max number of times, answer should be that word
     * if two or more words is appearing max number of times, answer should be that all those words
     */


}
