package Class4.LabSession;

import java.util.Locale;

public class Lab_Discussion1 {
    public static void main(String[] args) {

        /**
         * Store "valid" or "invalid" in the string variable (validOrInvalid)
         * Store a String in 'myName' variable.
         * if
         *      length of string stored in myName variable > 10 , validOrInvalid = valid
         * else,
         *      validOrInvalid = invalid
         *
         */
        String myName = "Arian Gorani";
        String validOrInvalid = myName.length() > 10 ? "Valid" : "Invalid";
        System.out.println("Value inside the 'validOrInvalid' variable: " + validOrInvalid);

        /**
         * Using the above created 'myName' variable.
         * if myName length is > 5, Assign 1st character of your name to 'myChar' (char) variable.
         * else, Assign Last character of your name to 'myChar' (char) variable.
         *
         * Pseudo Coding
         * 1. Store name value in 'myName' variable.
         * 2. int lastIndex = myName.length()-1
         * 3. using ternary
         *      char myChar = myName.length() > 5 ? myName.charAt(0) : myName.charAt(lastIndex)
         */


        /**
         * Using the above created 'myName' variable.
         * if myName length is > 5, Assign 1st character of your name to 'myLetter' (String) variable.
         * else, Assign Last character of your name to 'myLetter' (String) variable.
         *
         * String myName = "Beautiful";
         * int nameLength = myName.length();
         *
         * String myLetter = nameLength > 5 ? subString(0,1) : subString(nameLength-1);
         *
         */

        String sentence = " I am a good programmer and this is a good day to be cool";

        String[] afterSplit_oo = sentence.split("oo");

        System.out.println("\nSentence --> " + sentence);

        System.out.println("Sentence after split 'oo' --> " + afterSplit_oo);
        // 4 -> " I am a g" , "d programmer and this is a g" , "d day to be c" , "l"

        /**
         * Enter your first name, and my code will:
         *
         * 1. Print the name in Titlecase (Happy)
         * 2. Print the number of letters in your first name.
         */
        String yourFirstName = "wiLLiaM";

        yourFirstName = yourFirstName.trim();                           // "WiLLiAm"

        String yourFirstNameLowerCase = yourFirstName.toLowerCase();    // "william"
        int yourFirstNameLength = yourFirstName.length();               // 7

        String firstLetterName = yourFirstNameLowerCase.substring(0,1).toUpperCase();   // "w" -> "W"
        String firstLetterRestName = yourFirstNameLowerCase.substring(1);

        System.out.println("Your first name is : "+firstLetterName + firstLetterRestName);
        System.out.println("The number of letter in your name is: " + yourFirstNameLength);

        /**
         * String sentence_1 = "Happy peace Grow"
         *
         * If String contains any vowel (a, e, i, o, u),
         *      print the index of 'a' from the given sentence.
         * else
         *      print index of 'z' from the given sentence.
         * PS: Pls DO NOT consider cases
         *
         */
        String sentanse_11 = "Happy peace Grow";
        String sentanceLower = sentanse_11.toLowerCase();

        boolean isContainVowel = sentanceLower.contains("a")
                || sentanceLower.contains("e")
                || sentanceLower.contains("i")
                || sentanceLower.contains("o")
                || sentanceLower.contains("u");

        int indexResult = isContainVowel ? sentanceLower.indexOf("a") : sentanceLower.indexOf("z");

        System.out.println(indexResult);
















    }
}
