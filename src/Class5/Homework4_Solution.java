package Class5;

public class Homework4_Solution {
    public static void main(String[] args) {

        // Due : March 8

        String sentence_3 = "hello dear, how are you?";
        boolean result;
        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         *
         * Hint: use ternary operator
         */
        int sentence3Length = sentence_3.length();
        // result = sentence3Length > 10;
        result = sentence3Length > 10 ? true : false;
        System.out.println("result -> " + result);  // result ->


        String sentence_4 = "We all ARe Good ProgRommeR";
        /**
         *  1. Replace all 'r' with 'f' (Ignore cases)
         *  r, R --> f
         */
        /**
         * 1. convert given String into lowercase (we all are good progrommer)
         * 2. replace 'r' with 'f'
         * 3. sout the final value  (we all afe good pfogfommef)    (We all Afe Good Pfogfommef)
         */
        /**
         * replace 'r' with 'f' --> "We all ARe Good PfogRommeR" --> replace 'R' with 'f' --> "We all Afe Good Pfogfommef"
         */
        System.out.println("Sentence_4 before replacement --> " + sentence_4);
        String sentence_4_rf = sentence_4.replace('r', 'f');
        String sentence_4_Rf = sentence_4_rf.replace('R', 'f');
        System.out.println("Sentence_4 after replacement --> " + sentence_4_Rf);    // "We all Afe Good Pfogfommef"


        String fullName = "Karen";
        /**
         * 1. Display the length of your fullname.
         * 2. Does your name start with 'K' (ignore cases)
         * 3. Does your full name contain 'a' (ignore cases)
         */
        // 2
        String fullName_Lowercase = fullName.toLowerCase();
        boolean isStartsWith_K = fullName_Lowercase.startsWith("k");

        boolean isContain_a = fullName_Lowercase.contains("a");



    }
}
