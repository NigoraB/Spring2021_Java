package Class4.LabSession;

import java.util.Arrays;

public class Lab_Discussion2 {
    public static void main(String[] args) {

        /**
         *      tolowercase
         *      contains
         *      replace
         *      startsWith
         *      split
         *      indexOf
         *
         */
        String sentence_1 = "Hello WorLD";  // hello world

        //  sentence_1 = sentence_1.toLowerCase();  // sentence_1 = "hello world"

        String sentence_1_lowercase = sentence_1.toLowerCase();
            // sentence_1 = "Hello WorLD"
            // sentence_1_lowercase = hello world

        // Does sentence_2 contains 'od p'?
        // Does 'I am a good programmer' contain 'OD p' (ignoring cases)?: true
        String sentence_2 = "I am a good programmer";
        String findThis = "odp";

        /**
         * 1. convert sentence_2 and findThis in tolowercase
         * 2. use contains method to find 'od p'
         */
        String sentence_2_lowercase = sentence_2.toLowerCase(); // i am a good programmer
        String findThis_lowercase = findThis.toLowerCase(); // od p

        boolean isContain_od_p = sentence_2_lowercase.contains(findThis_lowercase);   // exp ans: true

        System.out.println("Does '" + sentence_2 + "' contain '" + findThis + "' (ignoring cases)?: " + isContain_od_p);

        // replace
        String sentence_3 = "I am a good programmer, you are also goOd programmer";
        String toReplace = "od";

//         sentence_3 = sentence_3.toLowerCase(); // i am a good programmer, you are also good programmer
//         toReplace = toReplace.toLowerCase();   // od

        String sentence_3_Replace = sentence_3.replace(toReplace, "ABC DEF");    // I am a goABC DEF programmer, you are also goABC DEF programmer

        System.out.println(sentence_3_Replace);


        String yourName = "Happy";
        boolean yourName_StartsWith_ha = yourName.startsWith("ha");     // false


        // indexOf
        String yourName_1 = "Happy";
        int index_of_p = yourName_1.indexOf("p");   // 2
        System.out.println("Index of p : " + index_of_p);

        int index_of_py = yourName_1.indexOf("py");
        System.out.println("Index of py : " + index_of_py); // 3

        int index_of_Py = yourName_1.indexOf("Py");   // -1
        System.out.println("Index of Py : " + index_of_Py);


        String stringToSplit = "I am a good programmer, you are also goOd programmer";
        /*
            int, long, byte, boolean, String, char, etc

            Array --> String[] or Array of String
         */

        String[] afterSplit = stringToSplit.split("o");
        // ["I am a g" , "", "d pr", "grammer, y", "u are als", " g" , "Od pr" , "grammer"]
        System.out.println(Arrays.toString(afterSplit));


        /**
         * Store your name in 'myName' variable (String)
         * Store "valid" or "invalid" in the 'validOrInvalid' variable (String)
         *
         * if myName length is greater than 10
         *      validOrInvalid = "valid"
         * else
         *      validOrInvalid = "invalid"
         *
         * 1. Store name in myName variable
         * 2. calculate length of myName
         * 3.
         * if myName length is greater than 10
         *      validOrInvalid = "valid"
         * else
         *      validOrInvalid = "invalid"
         *
         */
//        String myName = "Sally Farag";
//        int nameLength = myName.length();
//        int length = 10;
//        String validOrInvalid = nameLength > length ? "valid" : "invalid";  // Ternary operator
//        System.out.println("My name's length is" + validOrInvalid);

        /**
         * Using the above created 'myName' variable.
         * 'myChar' (char) variable.
         *
         * if myName length is > 5, Assign 1st character of your name to 'myChar'
         * else, Assign Last character of your name to 'myChar'
         *
         * 1. Store name in myName variable.
         * 2. Find the length of myName
         * 3.
         * if myName length is > 5,
         *      Assign 1st character of your name to 'myChar' (fetch the 1st char present in myName --> charAt(0))
         * else,
         *      Assign Last character of your name to 'myChar' (fetch the Last char present in myName --> charAt(length-1))
         *
         */
        String myName = "Sal";
        int myNameLength = myName.length();
        char myChar = myNameLength > 5 ? myName.charAt(0) : myName.charAt(myNameLength-1);
        System.out.println("myChar --> " + myChar);

        String firstName = "       jeriaNNa      ";

        /**
         * 1. trim firstName and put in new variable (firstNameTrim) // firstNameTrim = jeriaNNa
         * 2. convert firstNameTrim into toUppercase // JERIANNA
         * 3. firstNameTrimUppercase fetch charAt(0) --> J
         * 4. subString fetch string from index-1 to end --> eriaNNa
         * 5. convert the subString in to lowercase --> erianna
         * 6. Step3+Step5 --> Jerianna
         * 7. Find the length of firstNameTrim --> 8
         *
         */

        /**
         *
         * Code output:
         * Entered name: '       jeriaNNa      '
         * Formatted Name: 'Jerianna'
         * Letters in the name: 8
         *
         */













































    }
}
