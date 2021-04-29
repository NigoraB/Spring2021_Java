package Class7;

public class Loops_Concept_1 {
    public static void main(String[] args) {

        /**
         * Loops:
         * 1. for loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4. do-while loop
         */

        /**
         * Ticket checker:
         *
         * start at seat-1, go upto the maxSeat No, seat+1
         *      pick ticket
         *      verify
         *      return ticket
         *
         */
        String[] names = {"Happy", "Peace", "Grow", "Learn"};

        /**
         * Happy
         * Peace
         * Grow
         * Learn
         */
//        System.out.println(names[0]);   // var = 0  (initial value = 0)         <-- Initialization
//        System.out.println(names[1]);   // var = 1  (rate of change = +1)       <-- increment
//        System.out.println(names[2]);   // var = 2
//        System.out.println(names[3]);   // var = 3  (lastValue = length - 1)    <-- condition
//
//        int var = 1;
//        System.out.println(names[var]);

        /**
         * Syntax for loop:
         *
         * for (initialization ; condition ; increment ) {
         *      // code inside
         *      // for-loop
         * }
         */

        String[] names1 = {"Happy", "Peace", "Grow", "Learn", "sleep", "share", "teach", "smile"};

        for (int i=0 ; i <= names1.length-1 ; i++) {      // i=0,1,2,3
            System.out.println(names1[i]);
        }

        /*
            1. initialization (int i=0)
            2. evaluates condition (i <= 3)    // 0 <= 3 --> true
            3.  If result is true
                    java enters the for-loop
                    sout(names[i]);     // sout(names[0]);  --> Happy
                    while existing the for-loop, java increments/decrements the value of i
                else
                    won't enter in the for-loop

            4. evaluates condition with new value of i ( i <= 3)   // 1 < = 3 --> true
            5. If result is true
                java enters the for-loop
                sout(names[i]);     // sout(names[1]);  --> Peace
            6. while existing the for-loop, java increments/decrements the value of i
            else
                won't enter in the for-loop
            ..
            ..
            ..
            until the condition result becomes false

         */

        // print the words in reverse order
        // names1[indexValue]
        /*
            smile   // sout(names1[names1.length-1]);   // sout(names1[7]);     // smile (int i = names1.length-1)
            teach   // sout(names1[names1.length-2]);   // sout(names1[6]);     // teach ( i = names1.length-2)
            share   // sout(names1[names1.length-3]);
            sleep   // sout(names1[names1.length-4]);
            Learn
            Grow
            Peace
            Happy   // sout(names1[names1.length-names1.length])    // sout(names1[0]);     // Happy
         */
        for (int i = names1.length-1 ; i >= 0  ; i--) {
            System.out.println(names1[i]);
        }

        System.out.println("\n");

        for (int i = 1 ; i <= names1.length ; i++) {
            System.out.println(names1[names1.length-i]);
        }


        // Print "Hello" 5 times.
        /**
         * Hello    i = 0
         * Hello
         * Hello
         * Hello
         * Hello    i = 4
         */

        for (int i=0 ; i <= 4 ; i++) {
            System.out.println("Hello");
        }

        String[] words = {"Happy", "Peace", "Grow", "Learn", "sleep", "share", "teach", "smile"};
        /**
         * Print the words present on even index
         *
         * Happy    // index-0      sout(words[0])      i=0     lastvalue = lastIndex   increment=2
         * Grow     // index-2      sout(words[2])
         * sleep    // index-4      sout(words[4])
         * teach    // index-6      sout(words[6])
         *
         */
        for (int i=0 ; i <= words.length-1 ; i+=2) {
            System.out.println(words[i]);
        }

        for (int i=0 ; i <= words.length-1 ; i++) {
            if (i%2 == 0) {
                System.out.println(words[i]);
            }
        }

        /**
         * Enhanced for-loop
         *      when you need to access values from index-0 to last-index, one by one
         *      in an array (or similar datatype)
         */

        String[] wordsAgain = {"Happy", "Peace", "Grow", "Learn", "sleep", "share", "teach", "smile"};

        for (int i=0 ; i <= wordsAgain.length-1 ; i++) {
            System.out.println(wordsAgain[i]);
        }

        /*
            for (datatype var : arrName) {
                // code inside the loop
            }

            for 1st loop --> var = arrName[0]
            for 2nd loop --> var = arrName[1]
            ...
            ...

         */

        for (String word : wordsAgain) {
            System.out.println(word);
        }


        for (String word : wordsAgain) {
            if (word.toLowerCase().contains("a")) {
                System.out.println(word);
            }
        }

        int[] ssnNumbers = {1111, 2222, 3333, 4444, 5555};
        /*
            1111
            2222
            3333
            4444
            5555
         */

        for (int i=0 ; i < ssnNumbers.length ; i++) {      //  i < 5 -- 0,1,2,3,4) ( i <= 4 -- 0,1,2,3,4)
            System.out.println(ssnNumbers[i]);
        }

        for (int ssn : ssnNumbers) {
            System.out.println(ssn);
        }


        String sentence_2 = "how are you dear";  // 4
        /**
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */
        /*
            1. to lowercase then split by ("")     // ["h", "a", "p", "p", "y", " ", "h", "o", "l", "i", "d", "a", "y", "s"]
            2. for (int i=0 ; i<length ; i++)

         */
        String[] sentence2Array = sentence_2.split("");
        int count = 0;
        for (String letter : sentence2Array) {
            if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u")) {
                count++;
            }
        }
        System.out.println("\n\nCount : " + count);











    }
}
