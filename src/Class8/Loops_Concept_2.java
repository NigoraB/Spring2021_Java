package Class8;

public class Loops_Concept_2 {
    public static void main(String[] args) {

        /**
         * Loops:
         * 1. for loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4. do-while loop
         */

        /**
         *
         * while loop syntax
         *
         * int j = 0
         * while (condition) {
         *      // code to run
         *      // until the condition is true
         *      increment/decrement operation
         * }
         *
         */

        String[] names1 = {"Happy", "Peace", "Grow", "Learn", "sleep", "share", "teach", "smile"};

//        int j=0;
//        while (j < names1.length) {
//            System.out.println(names1[j]);
//            j++;
//        }


        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        /*
            Letter at index-0: A
            Letter at index-1: B
            Letter at index-2: C
            Letter at index-3: D
            Letter at index-4: E
         */
        /*
        System.out.println("Letter at index-0: " + letters[0]);
        System.out.println("Letter at index-1: " + letters[1]);
        System.out.println("Letter at index-2: " + letters[2]);
        System.out.println("Letter at index-3: " + letters[3]);
        System.out.println("Letter at index-4: " + letters[4]);

         */
//        int l=0;
//        for (char alphabet : letters) {
//            System.out.println("Letter at index-" + l + ": " + alphabet);
//            l++;
//        }

//        for (int i=0 ; i < letters.length ; i++) {
//            System.out.println("Letter at index-" + i + ": " + letters[i]);
//        }
//
//        int k=0;
//        while ( k < letters.length) {
//            System.out.println("Letter at index-" + k + ": " + letters[k]);
//            k++;
//        }

        /**
         *
         * do-while syntax:
         *
         * do {
         *
         *   // code to run
         *   // until the condition is true
         *
         * } while (condition)
         *
         */
        // char[] letters = {'A', 'B', 'C', 'D', 'E'};

        int k=10;
        while ( k < letters.length ) {
            System.out.println("Letter at index-" + k + ": " + letters[k]);
            k++;
        }

        for (int i=10 ; i < letters.length ; i++) {
            System.out.println("Letter at index-" + i + ": " + letters[i]);
        }

        int m = 3;
        do {
            System.out.println("Letter at index-" + m);
            m++;
        } while (m < letters.length);

        /**
         * code inside the do-while loop will always run atleast one time.
         */













    }
}
